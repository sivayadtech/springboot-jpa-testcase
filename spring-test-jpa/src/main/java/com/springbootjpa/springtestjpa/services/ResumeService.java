package com.springbootjpa.springtestjpa.services;


import com.springbootjpa.springtestjpa.Entity.Applicant;
import com.springbootjpa.springtestjpa.Entity.Resume;
import com.springbootjpa.springtestjpa.repository.ApplicantRepository;
import com.springbootjpa.springtestjpa.repository.ResumeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeService {

    @Autowired
    private ApplicantRepository applicantRepository;
    @Autowired
    private ResumeRepository resumeRepository;

    public Resume addResume(Long applicationId, Resume resume) {
        Optional<Applicant> optionalApplicant = applicantRepository.findById(applicationId);
        if (optionalApplicant.isPresent()) {
            Applicant applicant = optionalApplicant.get();
            resume.setApplicant(applicant);
            resumeRepository.save(resume);
            return resume;
        }else {
            throw new RuntimeException("Applicant not found with id: " + applicationId);
        }
    }
}
