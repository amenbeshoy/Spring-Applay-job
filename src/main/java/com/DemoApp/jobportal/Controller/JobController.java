package com.DemoApp.jobportal.Controller;
import com.DemoApp.jobportal.Service.JobService;
import com.DemoApp.jobportal.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/jobs")
    public ResponseEntity<Job> createJob(@RequestBody Job job)
    {
        return ResponseEntity.ok(jobService.CreateJob(job));
    }

    @GetMapping("/Jobs/all")
    public ResponseEntity<List<Job>> getAllJobs()
    {
        return ResponseEntity.ok(jobService.getAllJobs());
    }

}
