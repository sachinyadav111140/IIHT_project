package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_price")
public class StockPriceEntity 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private Integer companyCode;
private String stockExchange;
private Double currentPrice;
private LocalDate date;
private LocalTime time;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Integer getCompanyCode() {
	return companyCode;
}
public void setCompanyCode(Integer companyCode) {
	this.companyCode = companyCode;
}
public String getStockExchange() {
	return stockExchange;
}
public void setStockExchange(String stockExchange) {
	this.stockExchange = stockExchange;
}
public Double getCurrentPrice() {
	return currentPrice;
}
public void setCurrentPrice(Double currentPrice) {
	this.currentPrice = currentPrice;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public LocalTime getTime() {
	return time;
}
public void setTime(LocalTime time) {
	this.time = time;
}
StockPriceEntity(Long id, Integer companyCode, String stockExchange, Double currentPrice, LocalDate date,
		LocalTime time) {
	super();
	this.id = id;
	this.companyCode = companyCode;
	this.stockExchange = stockExchange;
	this.currentPrice = currentPrice;
	this.date = date;
	this.time = time;
}
StockPriceEntity() {
	super();
	// TODO Auto-generated constructor stub
}

}
