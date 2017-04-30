package com.unimelb.swen30006.workshops;

import java.util.Scanner;

public class Student {
	Scanner scanner = new Scanner(System.in);
	
	public void createFile(){
		
		int fileNumber = 0;
		String name;
		String data;
		String type;
		System.out.println("create file start, input number of files to submit: ");
		fileNumber = Integer.parseInt(scanner.nextLine());
		File[] personalFileList = new File[fileNumber];
		for(int i=1;i<fileNumber+1;i++){
			System.out.println("create file No."+i+", input file name: ");
			name = scanner.nextLine();
			System.out.println("create file No."+i+", input file data: ");
			data = scanner.nextLine();
			System.out.println("create file No."+i+", input file type: ");
			type = scanner.nextLine();
			File file = new File(name, data, type);
			personalFileList[i] = file;
		}
	}
	
	public void submitAssignment(){
		
	}

}
