package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.IpoDetailsEntity;

import antlr.collections.List;
@Repository
public interface IpoDetailsRepo extends JpaRepository<IpoDetailsEntity,Long>{
	public void deleteByCompanyName(String companyName);
	public List findByCompanyName(String companyName);

}
