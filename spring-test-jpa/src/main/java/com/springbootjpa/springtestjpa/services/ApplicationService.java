package com.springbootjpa.springtestjpa.services;

import com.springbootjpa.springtestjpa.Entity.Applicant;
import com.springbootjpa.springtestjpa.Entity.Application;
import com.springbootjpa.springtestjpa.repository.ApplicantRepository;
import com.springbootjpa.springtestjpa.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationService {
    @Autowired
    private ApplicantRepository applicantRepository;
    @Autowired
    private ApplicationRepository applicationRepository;

    public Application saveApplication(Long applicantId, Application application) {
        Optional<Applicant> optionalApplicant=applicantRepository.findById(applicantId);
        //optionalApplicant.ifPresent(application::setApplicant);
        if(optionalApplicant.isEmpty()){
           Applicant applicant= optionalApplicant.get();
           application.setApplicant(applicant);
            return applicationRepository.save(application);
        }else {
            throw new RuntimeException("Application not found"+applicantId);
        }
    }
}
