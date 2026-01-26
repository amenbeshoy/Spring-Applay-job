package com.DemoApp.jobportal.repository;

import com.DemoApp.jobportal.model.Application;
import com.DemoApp.jobportal.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {
}
