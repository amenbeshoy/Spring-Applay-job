package com.DemoApp.jobportal.Controller;

import com.DemoApp.jobportal.Service.ApplicationService;
import com.DemoApp.jobportal.Service.JobService;
import com.DemoApp.jobportal.model.Application;
import com.DemoApp.jobportal.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/Apply/{jobId}")
    public ResponseEntity<Application> applyJob(
            Principal principal,
            @PathVariable Long jobId
    ) {
        var username = principal.getName();

        return ResponseEntity
                .ok(applicationService.applyForJob(username, jobId));
    }
}
