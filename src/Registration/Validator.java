package Registration;

import com.Student;

import universityexceptions.AgeException;
import universityexceptions.ValidatorException;

public class Validator {

	private static Validator singletonObj;
	
	private Validator() {
	}
	public static Validator getValidator() {
		if(singletonObj==null)
		return new Validator();
		else
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
