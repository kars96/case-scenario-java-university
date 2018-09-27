package Examination;

public class Evaluator {

	private static Evaluator singletonObj;

	private Evaluator() {
		// TODO Auto-generated constructor stub
	}

	public static Evaluator getEvaluator() {
		if (singletonObj == null)
			return new Evaluator();
		else
			return singletonObj;
	}

	public String evaluate(Paper paper) {
		return "Pass";
	}
	
	

}
