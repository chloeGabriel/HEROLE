package com.cgrpg.repository;

import com.cgrpg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String name);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
