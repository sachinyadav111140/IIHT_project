package com.example.demo.dtos;

public class DirectorDto 
{
private Long id;
private String directorName;

public DirectorDto() {
	super();
}
DirectorDto(Long id, String directorName) {
	super();
	this.id = id;
	this.directorName = directorName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDirectorName() {
	return directorName;
}
public void setDirectorName(String directorName) {
	this.directorName = directorName;
}
}
