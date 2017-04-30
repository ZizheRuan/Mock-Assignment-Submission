package com.unimelb.swen30006.workshops;

class Submission {
	public int attempCount;
	private File[] files;
    
	public Submission(){
		this.files = new File[0];
	}
	
    public File[] includedFiles(){
        return files;
    }
    
    public void attachFiles(File[] files){
    		this.files = files;
    }
    
    public void attemp(){
    		attempCount+=1;
    }
    
}
