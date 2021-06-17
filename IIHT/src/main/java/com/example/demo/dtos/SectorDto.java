package com.example.demo.dtos;

public class SectorDto
{
    private Long sectorId;
	private String sectorName;
	private String brief;
	public Long getSectorId() {
		return sectorId;
	}
	public void setSectorId(Long i) {
		this.sectorId = i;
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
	SectorDto(Long sectorId, String sectorName, String brief) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.brief = brief;
	}
	SectorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SectorDto [sectorId=" + sectorId + ", sectorName=" + sectorName + ", brief=" + brief + "]";
	}

	
}
