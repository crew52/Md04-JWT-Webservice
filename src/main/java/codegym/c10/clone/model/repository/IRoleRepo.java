package codegym.c10.clone.model.repository;

import codegym.c10.clone.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepo extends JpaRepository<Role, Long> {
}

