package com.springbootjpa.springtestjpa.services;


import com.springbootjpa.springtestjpa.Entity.Applicant;
import com.springbootjpa.springtestjpa.Entity.Resume;
import com.springbootjpa.springtestjpa.repository.ApplicantPagingAndSorting;
import com.springbootjpa.springtestjpa.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;
    @Autowired
    private ApplicantPagingAndSorting applicantPagingAndSorting;


    public List<Applicant> getAllApplicants() {
        Iterable<Applicant> applicants = applicantRepository.findAll();
        List<Applicant> applicantList = new ArrayList<Applicant>();
        applicants.forEach(applicantList::add);
        return applicantList;
    }

    public Applicant getApplicantById(Long applicantId) {
        return null;
    }

    public Applicant saveApplicant(Applicant applicant) {
        Resume resume=applicant.getResume();
        if (resume != null) {
            resume.setApplicant(applicant);
        }
        return applicantRepository.save(applicant);
    }

    public Iterable<Applicant> getApplicantsWithPagination(int pageNumber, int pageSize) {
      return applicantPagingAndSorting.findAll(PageRequest.of(pageNumber, pageSize));
    }
}
