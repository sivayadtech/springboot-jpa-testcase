package com.springbootjpa.springtestjpa.controller;

import com.springbootjpa.springtestjpa.Entity.Application;
import com.springbootjpa.springtestjpa.repository.ApplicationRepository;
import com.springbootjpa.springtestjpa.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/{applicantId}")
    public ResponseEntity<Application> creteApplication(@PathVariable Long applicantId, @RequestBody Application application) {
        return ResponseEntity.ok(applicationService.saveApplication(applicantId, application));
    }
}
