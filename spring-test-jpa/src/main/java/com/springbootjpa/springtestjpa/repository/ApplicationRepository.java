package com.springbootjpa.springtestjpa.repository;

import com.springbootjpa.springtestjpa.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application,Long> {
}
