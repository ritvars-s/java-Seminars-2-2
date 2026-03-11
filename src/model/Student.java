package model;


//modelu klase 
public class Student extends Person{
	//mainigie
	
	private long studentID;
	private String personCode;
	
	private static long counter = 0;
	
	//funkcijas
	//get
	public long getStudentID() {
		return studentID;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	//set ==============
	public void setStudentID() {
		studentID = counter;
		counter++;
	}
	public void setPersonCode(String newPersonCode){
		if ( (!newPersonCode.isEmpty()) && (newPersonCode != null) && (newPersonCode.matches("[1-9]{6}[-]{1}[1-9]{5}"))) {
			personCode = newPersonCode;
		}
		else {
			personCode = "Unknown";
		}
	}
	
	//bezargumenta konst
	public Student() {
		super();//izsauksies automatiski person konstruktors
		setStudentID();
		setPersonCode("240051-21441");
	};
	//argumenta konst
	public Student(String newName, String newSurname, String newPersonCode) {
		super(newName, newSurname);//izsakuks Person konstruktoru
		setStudentID();
		setPersonCode(newPersonCode);
	}
	//toString funkcija
	@Override //var nerakstit bet tapat parrakstis klases toString funkciju
	public String toString() {
		String result = studentID + ": " + name + " " + surname + " (" + personCode + ")"; 
		return result;
	}
	
	//visas parejas funkcijas pec nepieciesamibas
}
