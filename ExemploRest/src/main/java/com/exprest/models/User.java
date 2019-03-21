package com.exprest.models;

import org.springframework.stereotype.Service;

@Service
public class User {

	private String name;
	private int id;
	private String job;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}
