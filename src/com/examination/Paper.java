package com.examination;

public class Paper {
	public String submit() {
		Evaluator evaluator = Evaluator.getEvaluator();
		String result = evaluator.evaluate(this);
		return result;
	}

}
