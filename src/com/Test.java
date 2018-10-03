package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		History history = new History(125);
		String s1="rise of aryans";
		String s2="rise of mughals";
		String s3="rise of buddha";
		List<String> ll = new ArrayList<>();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		history.addSyllabus(ll);
		s1="World war 1 ";
		s2="World war 2 ";
		s3="World war 3 ";
		List<String> ll2 = new ArrayList<>();
		ll2.add(s1);
		ll2.add(s2);
		ll2.add(s3);
		history.addSyllabus(ll2);
		Subject.addSubject("history",history);
		try{
//		Student std2 = new Student("Ozvitha", 30);
		Student std2 = new Student( "karthik", MartialStatus.SINGLE, 21, Gender.MALE, new Date(1996, 9, 2), "Bengaluru", "Karth@gmail.com", "kk@outlook", "7022408615", Subject.getSubject("history"), null, "Indian");
		Student std1 = new Student("Praveen",30);
		Student std3 = new Student("Kars",30);
		Student std4 = new Student("San",30);
		Student std5 = new Student("Dan",30);
		Student std6 = new Student("Fanny",30);
		Student std7 = new Student("Handy",30);
		Student std8 = new Student("Sindy",30);
		Student std9 = new Student("Lindy",30);
		
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
//		
//		
//		try {
//			std1.registerStudent();
//		} catch (UniversityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		std1.registerForExam();
//		std1.apperForExam();
//		System.out.println("Result: " + std1.getResult());
//
	}

}
