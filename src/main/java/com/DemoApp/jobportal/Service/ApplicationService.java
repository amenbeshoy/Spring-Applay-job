package com.DemoApp.jobportal.Service;


import com.DemoApp.jobportal.model.Application;
import com.DemoApp.jobportal.model.Job;
import com.DemoApp.jobportal.repository.ApplicationRepository;
import com.DemoApp.jobportal.repository.JobRepository;
import com.DemoApp.jobportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApplicationRepository applicationRepository;


    public Application applyForJob(String username,Long jobId)
    {
        var user=userRepository.findByEmail(username)
                .orElseThrow(()->new RuntimeException("User Not Found"));


        var job=jobRepository.findById(jobId)
                .orElseThrow(()->new RuntimeException("Job Not Found"));

        Application application=new Application(user,job);

        return  applicationRepository.save(application);
    }

}
