package service;
import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import model.enums.ProfDegree;

public class MainService {
	
	private static ArrayList<Student> allStudents = new ArrayList<Student>(); 
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>(); 
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>(); 
	
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Juris", "Aborggens", "123456-45321");
		Student student3 = new Student("423532", "124 s", "1sfafsg");
		allStudents.add(student1);
		allStudents.add(student2);
		allStudents.add(student3);
		
		for (Student tempS : allStudents) {
			System.out.println(tempS);
		}
		
		/*
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		*/
		
		Professor prof1 = new Professor();
		Professor prof2 = new Professor("Vairis", "Cauna", ProfDegree.phd);
		Professor prof3 = new Professor("Galina", "HIlkevica", ProfDegree.phd);
		for(Professor tempP : allProfessors) {
			System.out.println(tempP);
		}
		/*
		System.out.println(prof2);
		System.out.println(prof3);
		*/
		System.out.println("===============Course=============");
		Course cour1 = new Course();
		Course cour2 = new Course("Java", (byte)6, prof1);
	
		allCourses.addAll(Arrays.asList(cour1, cour2));
		System.out.println(allCourses);
		/*
		System.out.println(cour1);
		System.out.println(cour2);
		*/
		System.out.println("==============Grade===========");
		Grade grade1 = new Grade();
		Grade grade2 = new Grade(5, student2, cour2);
		allGrades.addAll(Arrays.asList(grade1, grade2));
		System.out.println(allGrades);
		/*
		System.out.println(grade1);
		System.out.println(grade2);
		*/
		System.out.println("==============CRUD testing===========");
		try {
			createStudent("Janus","Berzzins","090512-23456");
			System.out.println(allStudents);
			System.out.println(getStudentByID(1));
			
			System.out.println(updateByID(2,"Baiba", "Jauka"));
			System.out.println(allStudents);
			
			deleteByID(1);
			System.out.println(allStudents);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	
	//CRUD - C CREATE, R RETRIEVE, U UPDATE, D DELETE
	//C - create student
	public static void createStudent(String newName, String newSurname, String newPersonCode) throws Exception {
		
		//TODO parbaudiet ienakosos paramentrus
		
		for (Student tempS : allStudents) {
			if(tempS.getPersonCode().equals(newPersonCode)){
				throw new Exception("Tads students jau eksiste");
			}
		}
		Student newStudent = new Student(newName, newSurname, newPersonCode);
		allStudents.add(newStudent);
		
	}
	
	//R -retrieve by id
	public static Student getStudentByID(long id) throws Exception{
		if(id < 0) {
			throw new Exception("id nevar but negativs");
		}
		for (Student tempS : allStudents) {
			if(tempS.getStudentID() == id) {
				return tempS;
			}
		}
		throw new Exception("Students ar id " + id + " neeksiste");
	}
	//U - update
	public static Student updateByID(int id, String newName, String newSurname) throws Exception{
		Student studentForUpdating = getStudentByID(id);
		
		//TODO parbaudit newName un newSurname
		if(!studentForUpdating.getName().equals(newName)) {
			studentForUpdating.setName(newName);
		}
		if(!studentForUpdating.getSurname().equals(newSurname)) {
			studentForUpdating.setSurname(newSurname);
		}
		
		return studentForUpdating;
	}
	//D - delete
	public static void deleteByID(int id) throws Exception{
		Student studentForDeleting = getStudentByID(id);
		allStudents.remove(studentForDeleting);
		
	}
	
}
