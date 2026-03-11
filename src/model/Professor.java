package model;
import model.enums.ProfDegree;

public class Professor {
	private long professorID;
	private String name;
	private String surname;
	private ProfDegree degree;
	
	private static long counter = 0;
	
	//get
	
	public long getProfessorID() {
		return professorID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	//set
	
	public void setProfessorID() {
		professorID = counter;
		counter++;
	}
	public void setName(String newName) {
		if((newName != null) && (!newName.isEmpty()) && (newName.matches("[A-Z]{1}[a-z]{2,20}([ ]{1}[A-Z]{1}[a-z]{2,20})?"))) {
			name = newName;
		}
		else {
			name = "Unknown";
		}
	}
	public void setSurname(String newSurname) {
		if((newSurname != null) && (!newSurname.isEmpty()) && (newSurname.matches("[A-Z]{1}[a-z]{2,20}([-]{1}[A-Z]{1}[a-z]{2,20})?"))) {
			surname = newSurname;
		}
		else {
			surname = "Unknown";
		}
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
		setProfessorID();
		setName("Miers");
		setSurname("Kauls");
		setDegree(ProfDegree.master);
	}
	
	public Professor(String newName, String newSurname, ProfDegree newDegree) {
		setProfessorID();
		setName(newName);
		setSurname(newSurname);
		setDegree(newDegree);
	}
	
	@Override //var nerakstit bet tapat parrakstis klases toString funkciju
	public String toString() {
		String result = professorID + ": " + name + " " + surname + " (" + degree + ")"; 
		return result;
	}
}

