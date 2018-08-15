package com.liferay.docs.librito.model;

public class Entry {
	private String name;
	private String message;
	private String newfield;
	
	public Entry() {
		   this.name = null;
		   this.message = null;
		   this.newfield = null;
	}

	public Entry(String name, String message) {
	   setName(name);
	   setMessage(message);
	}
	
	public Entry(String name, String message, String newfield) {
		   setName(name);
		   setMessage(message);
		   setNewfield(newfield);
		}

	public void setNewfield(String newfield) {
		this.newfield = newfield;
		
	}
	
	public String getNewfield() {
		return newfield;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
