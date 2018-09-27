package Examination;

import com.Student;

public class ExamRegistrar {

	private static ExamRegistrar singletonObj;

	private ExamRegistrar() {
		// TODO Auto-generated constructor stub
	}

	public static ExamRegistrar getExamregister() {
		if (singletonObj == null)
			return new ExamRegistrar();
		else
			return singletonObj;
	}

	public Exam registeringStudentForExamination(Student student) {

		Paper paper = new Paper();
		Exam exam = new Exam(paper);
		return exam;

	}

}
