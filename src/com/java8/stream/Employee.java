package com.java8.stream;

public class Employee {
	
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

	public long getSalry() {
		return salry;
	}

	public void setSalry(long salry) {
		this.salry = salry;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public Employee(String name, int id, long salry, String deptName, int track) {
		super();
		this.name = name;
		this.id = id;
		this.salry = salry;
		this.deptName = deptName;
		this.track = track;
	}

	private String name;
	private int id;
	private long salry;
	
	private String deptName;
	
	private int track;

}
