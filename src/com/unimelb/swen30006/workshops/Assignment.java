package com.unimelb.swen30006.workshops;

import java.util.ArrayList;

public class Assignment implements SubmissionValidator{
	String subjectCode;
	String name;
	int MaxAttempTime=0;
	private ArrayList<File> allFiles;
	private ArrayList<Submission> invalidSubmission;
	
	public Assignment(String subjectCode, String name, int MaxAttempTime){
		this.subjectCode=subjectCode;
		this.name=name;
		this.MaxAttempTime=MaxAttempTime;
		allFiles = new ArrayList<File>();
	}

	@Override
	public ValidationError[] validateSubmission(Submission submission){
		ArrayList<ValidationError> errors = new ArrayList<ValidationError>();
		File[] files = submission.includedFiles();
		for (File eachfile: files){
			for (File file: allFiles){
				if (eachfile.getData().equals(file.getData())){
					ValidationError vaErrorObj = new ValidationError(eachfile);
					vaErrorObj.addError("plagiarism","plagiarism");
					errors.add(vaErrorObj);
				}
			}
		}
		
		if(errors.size()>0){
//			invalidSubmission.add(submission);
			return errors.toArray(new ValidationError[0]);
		}
		else{
			for(File file:files){
				allFiles.add(file);
			}
			return null;
		}
		
 	}
	
}
