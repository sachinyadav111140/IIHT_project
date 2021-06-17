package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StockExchangeEntity;

@Repository
public interface StockExchangeRepo extends JpaRepository<StockExchangeEntity, Long>
{
public StockExchangeEntity findByStockExchangeName(String stockExchangeName);
}
