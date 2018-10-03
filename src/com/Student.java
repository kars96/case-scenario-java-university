package com;

import java.io.Serializable;
import java.util.Date;

import com.examination.Exam;
import com.examination.ExamRegistrar;
import com.examination.Paper;
import com.registration.Registrar;
import com.universityexceptions.UniversityException;

public class Student extends Thread implements Comparable<Student>, Serializable{

	private String admissionId;
	private String studentName;
	private MartialStatus martialStatus;
	private int age;
	private Gender sex;
	private Date dob;
	private String address;
	private String primaryEmail;
	private String secondaryEmail;
	private String phNumber;
	private Subject subject;
	private String highEduQUa;
	private String nationality;
	private Exam exam;
	private String result;
	private Registrar registrar;
	
	
	
	public Student( String studentName, MartialStatus martialStatus, int age, Gender sex, Date dob,
			String address, String primaryEmail, String secondaryEmail, String phNumber, Subject subject,
			String highEduQUa, String nationality) {
		super();
		
		this.studentName = studentName;
		this.martialStatus = martialStatus;
		this.age = age;
		this.sex = sex;
		this.dob = dob;
		this.address = address;
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
		this.phNumber = phNumber;
		this.subject = subject;
		this.highEduQUa = highEduQUa;
		this.nationality = nationality;
		this.exam = exam;
		this.result = result;
		this.registrar = registrar;
	}
	@Override
	public void run(){
		try {
			registerStudent();
		} catch (UniversityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Student(String studentName, int age) {
		super();
		this.studentName = studentName;
		this.age =age;
		start();
//		this.ro=ro;
	}

	public Student(String studentName, int age, Subject subject, MartialStatus martialStatus, String phNumber,
			String primaryEmail, String secondaryEmail, String highEduQUa, String nationality) {
		this.studentName = studentName;
		this.age = age;
		this.subject = subject;
		this.martialStatus = martialStatus;
		this.phNumber = phNumber;
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
		this.highEduQUa = highEduQUa;
		this.nationality = nationality;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public synchronized void registerStudent() throws UniversityException {

		Registrar registar = Registrar.getRegister();
		admissionId = registar.registerStudent(this);
		System.out.println("Id: " + admissionId);

	}

	public void registerForExam() {
		ExamRegistrar examRegistrar = ExamRegistrar.getExamregister();
		exam = examRegistrar.registeringStudentForExamination(this);
	}

	public void apperForExam() {
		Paper paper = exam.getPaper();
		result = paper.submit();
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public MartialStatus getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(MartialStatus martialStatus) {
		this.martialStatus = martialStatus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public String getHighEduQUa() {
		return highEduQUa;
	}

	public void setHighEduQUa(String highEduQUa) {
		this.highEduQUa = highEduQUa;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void display() {
		System.out.println(getStudentName()+" has been registered "+getAdmissionId());
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public int compareTo(Student o) {
		
		return this.admissionId.compareTo(o.admissionId);
	}

}
