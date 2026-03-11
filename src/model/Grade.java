package model;

public class Grade {
	private long gradeID;
	private int value;
	private Student student;
	private Course course;
	
	private static long counter = 30000;
	
	public long getGradeID() {
		return gradeID;
	}
	public int getValue() {
		return value;
	}
	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	}
	
	public void setGradeID() {
		gradeID = counter;
		counter++;
	}
	public void setValue(int newValue) {
		if(newValue >= 0 && newValue <= 10) {
			value = newValue;
		} 
		else {
			value = 0;
		}
	}
	public void setStudent(Student newStudent) {
		if (newStudent != null) {
			student = newStudent;
		}
		else {
			student = new Student();
		}
	}
	public void setCourse(Course newCourse) {
		if (newCourse != null) {
			course = newCourse;
		}
		else {
			course = new Course();
		}
	}
	
	public Grade() {
		setGradeID();
		setValue(0);
		setStudent(new Student());
		setCourse(new Course());
	}
	public Grade(int newValue, Student stud, Course cour) {
		setGradeID();
		setValue(newValue);
		setStudent(stud);
		setCourse(cour);
	}
	public String toString() {
		String result = student.getName() + " " + student.getSurname() + " Grade: " + value + course.getTitle();
		return result;
	}
	
	
	
}
