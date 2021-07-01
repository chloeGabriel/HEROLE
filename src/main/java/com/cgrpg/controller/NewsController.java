package com.cgrpg.controller;

import com.cgrpg.model.News;
import com.cgrpg.payload.request.CreateNewsRequest;
import com.cgrpg.payload.request.EditNewsRequest;
import com.cgrpg.payload.response.MessageResponse;
import com.cgrpg.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600) // TODO verify crossorigin legitimacy
@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    NewsRepository newsRepository;

    @PostMapping("")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> createNews(@Valid @RequestBody CreateNewsRequest newsRequest) {
        News news = new News(newsRequest.getTitle(), newsRequest.getContent(), newsRequest.getImagePath());
        newsRepository.save(news);
        return ResponseEntity.ok(new MessageResponse("News created"));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteNews(@PathVariable final Long id){
        newsRepository.deleteById(id);
    }

    @GetMapping("")
    public List<News> listNews(){
        return newsRepository.findAll();
    }

    @GetMapping("/{id}")
    public News getNewsById(@PathVariable final Long id){
        Optional<News> possibleNews = newsRepository.findById(id);
        if(! possibleNews.isEmpty()){
            return possibleNews.get();
        }
        return new News();
    }

    @PatchMapping("")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> editNews(@Valid @RequestBody EditNewsRequest editNewsRequest){
        Optional<News> editedNews = newsRepository.findById(editNewsRequest.getId());
        if(! editedNews.isEmpty()){
            News foundNews = editedNews.get();
            foundNews.setTitle(editNewsRequest.getTitle());
            foundNews.setContent(editNewsRequest.getContent());
            foundNews.setImagePath(editNewsRequest.getImagePath());
            foundNews.setModified(new Timestamp(System.currentTimeMillis()));
            newsRepository.save(foundNews);
            return ResponseEntity.ok(new MessageResponse("News edited"));
        }

        return ResponseEntity.ok(new MessageResponse("News not found")); // TODO proper http code !
    }

}