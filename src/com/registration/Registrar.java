package com.registration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

import com.Student;
import com.universityexceptions.NoSeatException;
import com.universityexceptions.RegistrationException;

public class Registrar {
	static short lastID = 1;

	TreeSet<Student> students = new TreeSet<>();
	private static Registrar singletonObj;

	public static Registrar getRegister() {
		if (singletonObj == null)
			singletonObj = new Registrar();
		return singletonObj;
	}

	private void serializeStudent(Student student) {
		File f1 = new File("src/resource/" + student.getAdmissionId() + ".txt");
		try {
			if (f1.createNewFile()) {
				FileOutputStream fos = new FileOutputStream(student.getAdmissionId() + ".txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(student);
				System.out.println(" serialize");
			} else
				System.out.println("Unable to serialize");
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	private Registrar() {

	}

	public String registerStudent(Student student) throws RegistrationException, NoSeatException {

		String admissionId = null;
		Limits l = Limits.getLimits();
		synchronized (l) {
			if (l.getStudentLimit() == 0)
				throw new NoSeatException("all seats filled");
			System.out.println("Name: " + student.getStudentName());
			Validator validator = Validator.getValidator();

			if (validator.validateStudentDetails(student)) {
				admissionId = "ABC" + String.format("%05d", lastID);
				lastID = (short) (lastID + (short) 1);
				student.setAdmissionId(admissionId);
				students.add(student);
				serializeStudent(student);
				l.decLimit();
				System.out.println(l.getStudentLimit());
				System.out.println(student.getStudentName() + " registered");
				// System.out.println(l);
				System.out.println(l);
				;
				student.display();
			}
		}
		return admissionId;

	}
}
