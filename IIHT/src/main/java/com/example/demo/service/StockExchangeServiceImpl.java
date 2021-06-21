package com.example.demo.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.StockExchangeDto;
import com.example.demo.entity.StockExchangeEntity;
import com.example.demo.repo.StockExchangeRepo;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {
	@Autowired
	private StockExchangeRepo stockExchangeRepo;
	@Autowired
	private ModelMapper modelMapper;

	public StockExchangeServiceImpl() {
		super();
	}

	public StockExchangeServiceImpl(StockExchangeRepo stockExchangeRepo, ModelMapper modelMapper) {
		super();
		this.stockExchangeRepo = stockExchangeRepo;
		this.modelMapper = modelMapper;
	}

	@Override
	@Transactional
	public StockExchangeDto getStockExchangeById(Long stockExchangeId) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(stockExchangeRepo.findById(stockExchangeId).get(), StockExchangeDto.class);
	}

	@Override
	@Transactional
	public StockExchangeDto getStockExchangeByName(String stockExchangeName) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper.map(stockExchangeRepo.findByStockExchangeName(stockExchangeName), StockExchangeDto.class);
	}

	@Override
	@Transactional
	public void addStockExchange(StockExchangeDto stockExchangeDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		stockExchangeRepo.save(modelMapper.map(stockExchangeDto, StockExchangeEntity.class));	
	}

}
