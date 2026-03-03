package com.springbootjpa.springtestjpa.repository;


import com.springbootjpa.springtestjpa.Entity.Applicant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicantPagingAndSorting extends PagingAndSortingRepository<Applicant, Long> {
}
