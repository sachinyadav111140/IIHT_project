package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class SectorEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String sectorName;
    private String brief;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	SectorEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	SectorEntity(Long id, String sectorName, String brief) {
		super();
		this.id = id;
		this.sectorName = sectorName;
		this.brief = brief;
	}
    
}
