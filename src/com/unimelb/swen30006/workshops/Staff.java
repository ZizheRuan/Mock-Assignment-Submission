package com.unimelb.swen30006.workshops;

import java.util.Scanner;

import javax.security.auth.Subject;

import java.util.HashMap;

public class Staff extends Person{
	public String name;
	public int staffID;
	public HashMap<String,Subject> subjects;
	Scanner scanner = new Scanner(System.in);
	
	public Staff(String name,int staffID){
		super(name,staffID);
		this.name=name;
		this.staffID=ID;
	}
	
	public void createSubject(String name,String subjectCode){
		Subject subject = new Subject(name,subjectCode);
		subjects.put(subjectCode, subject);
	}
	
	public void createAssignment(String subjectCode){
		String name;
		int MaxAttempTime;
		System.out.println("Assignment name: ");
		name=scanner.nextLine();
		System.out.println("Maximum attemp time: ");
		MaxAttempTime=Integer.parseInt(scanner.nextLine());

	}

}
