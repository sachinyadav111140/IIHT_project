package com.example.demo.service;

import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.CompanyDto;
import com.example.demo.entity.CompanyEntity;
import com.example.demo.repo.CompanyRepo;

import antlr.collections.List;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepo companyRepo;
	@Autowired
	private ModelMapper modelMapper;
	@Transactional
	public CompanyDto getCompanyById(Long companyId)
	{
		//return companyRepo.findById(companyId);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(companyRepo.findById(companyId), CompanyDto.class);
	}
	@Transactional
	public CompanyDto getCompanyByName(String companyName) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(companyRepo.findByCompanyName(companyName), CompanyDto.class);
	}
	@Transactional
	public CompanyDto addCompany(CompanyDto company) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		companyRepo.save(modelMapper.map(company, CompanyEntity.class));
		return company;
	}
	@Transactional
	public CompanyDto updateCompany(Long companyId, CompanyDto company) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		companyRepo.save(modelMapper.map(company, CompanyEntity.class));
		return company;
	}

	@Transactional
	public void deleteCompany(Long companyId) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		companyRepo.deleteById(companyId);
	}
  @Transactional
public List getAllcompanies() {
	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	List allCompanies = (List) companyRepo.findAll().stream().map(c -> modelMapper.map(c, CompanyDto.class)).collect(Collectors.toList());
	return allCompanies;
}

}

