package app.repository;

import app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


public interface UserRepoInterface extends JpaRepository<User, UUID>{





}
