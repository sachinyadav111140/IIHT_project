package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "company_table")
public class CompanyEntity 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "company_id")
private Long id;
@Column(name = "company_name")
private String companyName;
@Column(name="company_code")
private String companyCode;
@Column(name = "company_ceo")
private String companyCeo;

//@ElementCollection
//@OneToMany(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
//@JoinColumn(name = "company_id",nullable = false)
//private Set<String> directors= new HashSet<>();

@ElementCollection
private Set<String> listedInStockExchange = new HashSet<>();
private String sectorName;
private long turnover;
private String about;
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
public String getCompanyCode() {
	return companyCode;
}
public void setCompanyCode(String companyCode) {
	this.companyCode = companyCode;
}
public String getCompanyCeo() {
	return companyCeo;
}
public void setCompanyCeo(String companyCeo) {
	this.companyCeo = companyCeo;
}
//public Set<String> getDirectors() {
//	return directors;
//}
//public void setDirectors(Set<String> directors) {
//	this.directors = directors;
//}
public Set<String> getListedInStockExchange() {
	return listedInStockExchange;
}
public void setListedInStockExchange(Set<String> listedInStockExchange) {
	this.listedInStockExchange = listedInStockExchange;
}
public String getSectorName() {
	return sectorName;
}
public void setSectorName(String sectorName) {
	this.sectorName = sectorName;
}
public long getTurnover() {
	return turnover;
}
public void setTurnover(long turnover) {
	this.turnover = turnover;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}

public CompanyEntity() {
	super();
}

}




