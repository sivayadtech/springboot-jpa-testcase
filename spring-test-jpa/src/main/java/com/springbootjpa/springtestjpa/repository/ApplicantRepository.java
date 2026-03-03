package com.springbootjpa.springtestjpa.repository;


import com.springbootjpa.springtestjpa.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
}
