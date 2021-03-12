package edu.learn.rest_demo.repos;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import edu.learn.rest_demo.entities.User;

public interface UserRepo extends JpaRepository<User, UUID> {

    User findByUsername(String username);
}
