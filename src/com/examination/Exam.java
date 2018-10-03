package com.examination;

import java.io.Serializable;

public class Exam implements Serializable {

	private Paper paper;

	public Exam(Paper paper) {
		this.paper = paper;
	}

	public Paper getPaper() {
		return paper;
	}

}
