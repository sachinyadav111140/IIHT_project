package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Directors {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "director_id")
	private Long directorId;
	@Column(name = "director_name")
	private String directorName;
	public Long getDirectorId() {
		return directorId;
	}
	public void setDirectorId(Long directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	Directors(Long directorId, String directorName) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
	}
	Directors() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
