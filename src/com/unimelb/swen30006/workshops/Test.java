package com.unimelb.swen30006.workshops;

public class Test {

	public static void main(String[] args) {
		Staff lecturer = new Staff("Tio", "MIT");
		Student studentA = new Student("JIA","182838","MIT");
		Student studentB = new Student("YI","48586","MIS");
		
		lecturer.creatSubject();
		lecturer.creatAssignment();
		
		studentA.createFile();
		studentB.submitAssignment();
		
		studentA.createFile();
		studentB.submitAssignment();

	}

}
