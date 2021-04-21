package com.cgrpg.repository;

import com.cgrpg.model.Role;
import com.cgrpg.model.RoleEnum;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository {
    Role findByName(RoleEnum name);
}
