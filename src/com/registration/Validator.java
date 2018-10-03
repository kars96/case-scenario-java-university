package com.registration;

import com.Student;
import com.universityexceptions.AgeException;
import com.universityexceptions.ValidatorException;

public class Validator {

	private static Validator singletonObj;
	
	private Validator() {
	}
	public static Validator getValidator() {
		if(singletonObj==null)
		singletonObj = new Validator();
			return singletonObj;
	}

	public boolean validateStudentDetails(Student student) throws ValidatorException {

		if (student.getStudentName() != null) {
			if(student.getAge()<23 || student.getAge()>35)
				throw new AgeException("Age must be higher than 23 and lower than 35");
			return true;
		}

		return false;
	}

}
