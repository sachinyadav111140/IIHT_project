package com.example.demo.service;

import com.example.demo.dtos.SectorDto;


import antlr.collections.List;

public interface SectorService 
{

public SectorDto getSectorById(Long sectorId);
public List getCompaniesBySectorId(Long sectorId);
public void addSector(SectorDto sectorDto);

//public SectorDto getSectorById(Long sectorId);
}
