package com.example.demo.entity;

import javax.persistence.Column;
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
	@Column(name = "id")
	private Long stockExchangeId;
	private String stockExchangeName;
	private String brief;
	private String address;
	private String remarks;
	StockExchangeEntity(Long id, String stockExchangeName, String brief, String address, String remarks) {
		super();
		this.stockExchangeId = id;
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
	}
	public StockExchangeEntity() {
		super();
	}
	
	public Long getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeIid(Long stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
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
