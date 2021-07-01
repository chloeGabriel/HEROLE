package com.cgrpg.repository;

import com.cgrpg.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface NewsRepository extends JpaRepository<News,Long> {

}
