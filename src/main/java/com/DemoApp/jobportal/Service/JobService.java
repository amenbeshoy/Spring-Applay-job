package com.DemoApp.jobportal.Service;


import com.DemoApp.jobportal.model.Job;
import com.DemoApp.jobportal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public Job CreateJob(Job job)
    {
        return jobRepository.save(job);
    }
    public List<Job> getAllJobs()
    {
        return jobRepository.findAll();
    }
}
