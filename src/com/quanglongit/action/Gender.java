package com.quanglongit.action;

public enum Gender {
	MALE("Male"), 
	FEMALE("Female"),
	OTHER("Other");

	private String label;

	private Gender(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
