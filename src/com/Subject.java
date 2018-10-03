package com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Subject implements Serializable {
	String desc;
	int totalMarks;
	private static TreeMap<String, Subject> subjectMap;
	private List<List<String>> syllabus;

	public Subject(String desc, int totalMarks) {
		super();
		this.desc = desc;
		this.totalMarks = totalMarks;
	}

	static {
		subjectMap = new TreeMap<>();
	}

	{
		syllabus = new ArrayList<>();
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(int totalMarks2) {
		// TODO Auto-generated constructor stub
		this.totalMarks = totalMarks2;
	}

	public void addSyllabus(List<String> s) {
		try {
			syllabus.add(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeSyllabus(int index) {
		syllabus.remove(index);
	}

	public void display() {
		int i = 0;
		for (List<String> s : syllabus) {
			System.out.println("\t " + ++i);
			int j = 0;
			for (String t : s)
				System.out.println("\t\t" + ++j);
		}
	}

	public static Subject getSubject(String subjName) {
		return subjectMap.get(subjName);

	}

	public static void addSubject(String name, Subject subjObj) {
		subjectMap.put(name, subjObj);
	}
}
