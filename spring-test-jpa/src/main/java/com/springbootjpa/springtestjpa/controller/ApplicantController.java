package com.springbootjpa.springtestjpa.controller;



import com.springbootjpa.springtestjpa.Entity.Applicant;
import com.springbootjpa.springtestjpa.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {
    @Autowired
    private ApplicantService applicantService;

    @GetMapping
    public List<Applicant> getAllApplicants(){
        return applicantService.getAllApplicants();
    }
    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant) {
        return applicantService.saveApplicant(applicant);
    }

    @GetMapping("/page")
    public Iterable<Applicant> getApplicantsWithPagination(@RequestParam int page,@RequestParam int size) {
        System.out.println("Entered ApplicantController and Pointer is in /page method ");
        return applicantService.getApplicantsWithPagination(page, size);
    }

}
