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
	}

}
