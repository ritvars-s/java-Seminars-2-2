package model;

public class Course {
	private long courseID;
	private String title;
	private byte creditPoints;
	private Professor professor;
	
	private static long counter = 20000;
	
	public long getCourseID() {
		return courseID;
	}
	public String getTitle() {
		return title;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessor() {
		return professor;
	}
	
	public void setCourseID() {
		courseID = counter;
		counter++;
	}
	public void setTitle(String newTitle) {
		if ((newTitle != null) && (newTitle.matches("[A-Z]{1}[A-Za-z0-9 ]{3,40}"))){
			title = newTitle;
		}
		else {
			title = "Unknown";
		}
	}
	public void setCreditPoints(byte newCreditPoints){
		if((newCreditPoints >= 1) && (newCreditPoints <= 30)) {
			creditPoints = newCreditPoints;
		}
		else {
			creditPoints = 1;
		}
		
	}
	public void setProfessor(Professor prof) {
		if (prof != null) {
			professor = prof;
		}
		else {
			professor = new Professor();
		}
	}
	public Course() {
		setCourseID();
		setTitle("");
		setCreditPoints((byte)0);
		setProfessor(new Professor());
	}
	public Course(String newTitle, byte newCreditPoints, Professor prof) {
		setCourseID();
		setTitle("newTitle");
		setCreditPoints(newCreditPoints);
		setProfessor(prof);
	}
	
	public String toString() {
		String result = title + "(" + professor + " | " + creditPoints + " credit points)";
		return result;
	}
	
}
