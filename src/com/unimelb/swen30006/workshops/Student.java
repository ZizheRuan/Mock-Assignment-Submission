package com.unimelb.swen30006.workshops;

import java.util.Scanner;

public class Student extends Person{
	Scanner scanner = new Scanner(System.in);
	public String name;
	public int ID;
	public String department;
	public File[] personalFileList;
	public Submission submission;
	
	public Student(String name, int ID, String department){
		super(name,ID);
		this.name = name;
		this.ID = ID;
		this.department = department;
		submission = new Submission();
	}
	
	
	public void createFiles(){
		
		int fileNumber = 0;
		String name;
		String data;
		String type;
		System.out.println(this.name+" create file start, input number of files to submit: ");
		fileNumber = Integer.parseInt(scanner.nextLine());
		personalFileList = new File[fileNumber];
		for(int i=1;i<fileNumber+1;i++){
			System.out.println("create file No."+i+", input file name: ");
			name = scanner.nextLine();
			System.out.println("create file No."+i+", input file data: ");
			data = scanner.nextLine();
			System.out.println("create file No."+i+", input file type: ");
			type = scanner.nextLine();
			File file = new File(name, data, type);
			personalFileList[i-1] = file;
		}
	}
	
	
	public void submitAssignment(Assignment asm){
		if(submission.attempCount<=asm.MaxAttempTime){
			submission.attachFiles(personalFileList);
			
			if(asm.validateSubmission(submission)==null){
				System.out.println("submit success, this is the attemp No."+submission.attempCount);
			}
			else{
				System.out.println("submit failed, plagrism found, this is the attemp No."+submission.attempCount);
			}
			submission.attemp();
		}
		else 
			System.out.println("cannot submit, reach submit limit");
	}

}
