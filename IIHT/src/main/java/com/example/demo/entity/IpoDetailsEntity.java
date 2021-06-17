package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IpoDetailsEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String companyName;
	private String stockExchangeName;
	private float pricePerShare;
	private Long totalNumberOfShares;
	private Date openDateTime;
	private String remarks;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public float getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public Long getTotalNumberOfShares() {
		return totalNumberOfShares;
	}
	public void setTotalNumberOfShares(Long totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}
	public Date getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPOdetailsEntity [id=" + id + ", companyName=" + companyName + ", stockExchangeName="
				+ stockExchangeName + ", pricePerShare=" + pricePerShare + ", totalNumberOfShares="
				+ totalNumberOfShares + ", openDateTime=" + openDateTime + ", remarks=" + remarks + "]";
	}
	IpoDetailsEntity(Long id, String companyName, String stockExchangeName, float pricePerShare,
			Long totalNumberOfShares, Date openDateTime, String remarks) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.stockExchangeName = stockExchangeName;
		this.pricePerShare = pricePerShare;
		this.totalNumberOfShares = totalNumberOfShares;
		this.openDateTime = openDateTime;
		this.remarks = remarks;
	}
	IpoDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
