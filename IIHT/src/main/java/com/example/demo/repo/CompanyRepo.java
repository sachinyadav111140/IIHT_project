package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CompanyEntity;
@Repository
public interface CompanyRepo extends JpaRepository<CompanyEntity, Long>{
CompanyEntity findByCompanyName(String companyName);
}
