package com.liferay.docs.librito.model;

public class EntryOLD {
	private String name;
	private String message;
	private String alonso;

	public EntryOLD() {
		this.name = null;
		this.message = null;
		this.alonso = null;
	}

	public EntryOLD(String name, String message) {
		setName(name);
		setMessage(message);
	}

	public EntryOLD(String name, String message, String alonso) {
		setName(name);
		setMessage(message);
		setAlonso(alonso);
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

	public String getAlonso() {
		return alonso;
	}

	public void setAlonso(String alonso) {
		this.alonso = alonso;
	}

}
