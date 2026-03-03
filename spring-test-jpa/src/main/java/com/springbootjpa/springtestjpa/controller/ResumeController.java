package com.springbootjpa.springtestjpa.controller;



import com.springbootjpa.springtestjpa.Entity.Resume;
import com.springbootjpa.springtestjpa.services.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @PostMapping("/{applicationId}/resume")
    public ResponseEntity<Resume> addResume(@PathVariable Long applicationId, @RequestBody Resume resume){
        return ResponseEntity.ok(resumeService.addResume(applicationId,resume));
    }

}
