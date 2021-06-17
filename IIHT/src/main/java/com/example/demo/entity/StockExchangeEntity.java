package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_exchange")
public class StockExchangeEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String stockExchangeName;
	private String brief;
	private String address;
	private String remarks;
	StockExchangeEntity(Long id, String stockExchangeName, String brief, String address, String remarks) {
		super();
		this.id = id;
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
	}
	public StockExchangeEntity() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	

}
