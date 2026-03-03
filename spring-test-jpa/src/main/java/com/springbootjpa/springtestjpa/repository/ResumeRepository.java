package com.springbootjpa.springtestjpa.repository;


import com.springbootjpa.springtestjpa.Entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
