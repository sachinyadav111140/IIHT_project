package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.SectorDto;
import com.example.demo.entity.SectorEntity;
import com.example.demo.service.SectorService;

import antlr.collections.List;

@RestController
@RequestMapping("/sector")
public class SectorController {
	@Autowired
private SectorService sectorService;

	SectorController(SectorService sectorService) {
		super();
		this.sectorService = sectorService;
	}
	@GetMapping("/{sectorId}")
	public ResponseEntity<SectorEntity> getSectorById(@PathVariable("sectorId") Long sectorId)
	{
		return new ResponseEntity<SectorEntity>(sectorService.getSectorById(sectorId),HttpStatus.FOUND);
	}
	
	
//	@RequestMapping(value ="/{sectorId}",method = {RequestMethod.GET,RequestMethod.POST} )
//	public ResponseEntity<SectorDto> getSectorById(@PathVariable("sectorId") Long sectorId)
//	{
//		return new ResponseEntity<SectorDto>(sectorService.getSectorById(sectorId), HttpStatus.FOUND);
//	}
//	
	@GetMapping("/{sectorId}/companies")
	public ResponseEntity<List> getCompaniesBySectorId(@PathVariable("sectorId") Long sectorId){
		return new ResponseEntity<List>(sectorService.getCompaniesBySectorId(sectorId), HttpStatus.FOUND);
	}
	@PostMapping("/")
	public ResponseEntity<SectorDto> addSector(@RequestBody SectorDto sectorDto){
		sectorService.addSector(sectorDto);
		return new ResponseEntity<SectorDto>(HttpStatus.CREATED);
	}
}
