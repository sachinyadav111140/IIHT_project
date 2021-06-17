package com.example.demo.service;

import com.example.demo.dtos.StockExchangeDto;

public interface StockExchangeService 
{

	public StockExchangeDto getStockExchangeById(Long stockExchangeId) ;
	public StockExchangeDto getStockExchangeByName(String stockExchangeName);
	void addStockExchange(StockExchangeDto stockExchangeDto);
}
