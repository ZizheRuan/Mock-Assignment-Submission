package com.unimelb.swen30006.workshops;

import java.util.Scanner;
import java.util.HashMap;

public class Staff extends Person{
	public String name;
	public int staffID;
	public String department;
	public HashMap<String,Subject> subjects;
	public HashMap<Subject,HashMap<String,Assignment>> teachingSubjects;
	Scanner scanner = new Scanner(System.in);
	
	public Staff(String name,int staffID, String department){
		super(name,staffID);
		this.name=name;
		this.staffID=ID;
		this.department=department;
		teachingSubjects = new HashMap<Subject,HashMap<String,Assignment>>();
		subjects = new HashMap<String,Subject>();
	}
	
	public void createSubject(String name,String subjectCode){
		Subject subject = new Subject(name, subjectCode);
		this.subjects.put(subjectCode, subject);
		HashMap<String, Assignment> assignments = new HashMap<String, Assignment>();
		teachingSubjects.put(subject,assignments);
	}
	
	public void createAssignment(String subjectCode){
		String name;
		int MaxAttempTime;
		System.out.println("Assignment name: ");
		name=scanner.nextLine();
		System.out.println("Maximum attemp time: ");
		MaxAttempTime=Integer.parseInt(scanner.nextLine());
		Assignment assignment = new Assignment(subjectCode, name, MaxAttempTime);
		teachingSubjects.get(this.subjects.get(subjectCode)).put(name, assignment);
	}
	
	public Assignment getAssignment(String subjectCode, String name){
		return teachingSubjects.get(subjects.get(subjectCode)).get(name);
		
	}

}
