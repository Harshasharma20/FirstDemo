package com.demo.firstdemo.model;

public class FirstDemoModel {
	
	private String greeting;
	
	private String name;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FirstDemoModel(String greeting, String name) {
		super();
		this.greeting = greeting;
		this.name = name;
	}

	public FirstDemoModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
