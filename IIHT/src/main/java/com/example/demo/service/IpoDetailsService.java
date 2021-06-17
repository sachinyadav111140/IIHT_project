package com.example.demo.service;

import com.example.demo.dtos.IpoDetailsDto;

public interface IpoDetailsService
{
	public IpoDetailsDto getIpoDetailsByName(String companyName);

	public void addIpoDetailsByName(IpoDetailsDto ipoDetailsDto);

	public void updateIpoDetailsByName(String companyName, IpoDetailsDto ipoDetailsDto);

	public void deleteIpoDetailsByName(String companyName);
}
