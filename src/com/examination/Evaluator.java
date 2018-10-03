package com.examination;

public class Evaluator {

	private static Evaluator singletonObj;

	private Evaluator() {
		// TODO Auto-generated constructor stub
	}

	public static Evaluator getEvaluator() {
		if (singletonObj == null)
			singletonObj =  new Evaluator();
			return singletonObj;
	}

	public String evaluate(Paper paper) {
		return "Pass";
	}
	
	

}
