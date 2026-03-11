package model;
import model.enums.ProfDegree;

public class Professor extends Person {
	private long professorID;
	private ProfDegree degree;
	
	private static long counter = 0;
	
	//get
	
	public long getProfessorID() {
		return professorID;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	//set
	
	public void setProfessorID() {
		professorID = counter;
		counter++;
	}
	public void setDegree(ProfDegree newDegree) {
		if(newDegree != null){
			degree = newDegree;
		}
		else {
			degree = ProfDegree.other;
		}
	}
	public Professor() {
		super();
		setProfessorID();
		setDegree(ProfDegree.master);
	}
	
	public Professor(String newName, String newSurname, ProfDegree newDegree) {
		super(newName, newSurname);
		setProfessorID();
		setDegree(newDegree);
	}
	
	@Override //var nerakstit bet tapat parrakstis klases toString funkciju
	public String toString() {
		String result = professorID + ": " + name + " " + surname + " (" + degree + ")"; 
		return result;
	}
}

