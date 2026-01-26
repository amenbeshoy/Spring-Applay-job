package com.DemoApp.jobportal.repository;

import com.DemoApp.jobportal.model.Job;
import com.DemoApp.jobportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String Username);
}
