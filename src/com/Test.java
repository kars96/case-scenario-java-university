package com;

import universityexceptions.UniversityException;

public class Test {

	public static void main(String[] args) {

		try{
		Student std2 = new Student("Ozvitha", 30);

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
