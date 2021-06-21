package com.example.demo.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.SectorDto;
import com.example.demo.entity.SectorEntity;
import com.example.demo.repo.SectorRepo;

import antlr.collections.List;

@Service
public class SectorServiceImpl implements SectorService{
	@Autowired
	private SectorRepo  sectorRepo;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public SectorDto getSectorById(Long sectorId) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(sectorRepo.findById(sectorId).get(), SectorDto.class);
	}
	@Override
	@Transactional
	public List getCompaniesBySectorId(Long sectorId) {
		return null;
	}
	@Override
	@Transactional
	public void addSector(SectorDto sectorDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		sectorRepo.save(modelMapper.map(sectorDto, SectorEntity.class));
		
		
	}
	
	

}
