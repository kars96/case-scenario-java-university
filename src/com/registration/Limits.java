package com.registration;

public class Limits {
	private int studentLimit;
	private static Limits singletonObj;

	private Limits() {
		studentLimit = 5;
	}

	public static Limits getLimits() {
		if (singletonObj == null) {
			singletonObj = new Limits();
			return singletonObj;
		} else
			return singletonObj;
	}

	public int getStudentLimit() {
		return studentLimit;
	}

	public synchronized void setStudentLimit(int studentLimit) {
		this.studentLimit = studentLimit;
	}

	public void decLimit() {
		studentLimit--;
	}

}
