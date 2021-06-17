package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.CompanyDto;
import com.example.demo.service.CompanyService;

import antlr.collections.List;

@RestController
@RequestMapping("/company")
public class CompanyController 
{
	@Autowired
	private CompanyService companyService;
	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@GetMapping("/allcompanies")
	public ResponseEntity<List> getAllCompanies(){
		return new ResponseEntity<List>(companyService.getAllcompanies(), HttpStatus.OK);
	}
	
	@GetMapping("/{companyId}")
	public ResponseEntity<CompanyDto> getCompanyById(@PathVariable("companyId") Long companyId){
		//System.out.println(companyId);
		//return companyService.getCompanyById(companyId);
		
		return new ResponseEntity<CompanyDto>(companyService.getCompanyById(companyId), HttpStatus.FOUND);
	}
	
	@PostMapping("/")
	public ResponseEntity<CompanyDto> addCompany(@RequestBody CompanyDto company){
		return new ResponseEntity<>(companyService.addCompany(company), HttpStatus.CREATED);
	}
	
	@PutMapping("/{companyId}")
	public ResponseEntity<CompanyDto> updateCompany(@RequestBody CompanyDto company, @PathVariable("companyId") Long companyId){
		return new ResponseEntity<>(companyService.updateCompany(companyId, company), HttpStatus.OK);
	}
	
	@DeleteMapping("/{companyId}")
	public ResponseEntity<CompanyDto> deleteCompany(@PathVariable("companyId") Long companyId){
		companyService.deleteCompany(companyId); 
		return new ResponseEntity<CompanyDto>(HttpStatus.OK);
	}
}
