package model;

public class Person {
	//1 mainigie
	protected String name;
	protected String surname;
	//2 getters
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	//3 setters
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
	
	public Person() {
		setName("Liga");
		setSurname("Jauka");
	}
	public Person(String newName, String newSurname) {
		setName(newName);
		setSurname(newSurname);
	}
	public String toString() {
		String result = name + " " + surname;
		return result;
	}
}
