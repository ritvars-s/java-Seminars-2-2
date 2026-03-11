package service;
import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import model.enums.ProfDegree;

public class MainService {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Juris", "Aborggens", "123456-45321");
		Student student3 = new Student("423532", "124 s", "1sfafsg");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		Professor prof1 = new Professor();
		
		System.out.println(prof1);
		
		Professor prof2 = new Professor("Vairis", "Cauna", ProfDegree.phd);
		Professor prof3 = new Professor("Galina", "HIlkevica", ProfDegree.phd);
		System.out.println(prof2);
		System.out.println(prof3);
		
		System.out.println("===============Course=============");
		Course cour1 = new Course();
		Course cour2 = new Course("JAVA", (byte)6, prof1);
		System.out.println(cour1);
		System.out.println(cour2);
		
		System.out.println("==============Grade===========");
		Grade grade1 = new Grade();
		Grade grade2 = new Grade(5, student2, cour2);
		System.out.println(grade1);
		System.out.println(grade2);
	}

}
