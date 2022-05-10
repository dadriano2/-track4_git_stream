package org.ssglobal.training.codes;

import java.util.ArrayList;
import java.util.List;

public class Score {

	private String firstName;
	private String lastName;
	private int score;
	
	public Score() {
		
	}
	
	public Score(String lName, String fName, int s) {
		firstName = fName;
		lastName = lName;
		score = s;
	}
	
	public double getNumScores() {
		return 0.0;
	}
	
	public double getAverage() {
		return 0.0;
	}
	
	public int getNumberALister() {
		return 0;
	}
	
	public List<Score> getFailingStudentList(){
		List<Score> result = new ArrayList<Score>();
		return result;
	}
	
	public void printPassingStudents() {
		
	}
	
	public void displayAllStudents() {
		
	}
	
	public List<Score> getStudentRecords(){
		List<Score> result = new ArrayList<Score>();
		return result;
	}
}
