package org.douifi.Exercice11;


public class Person {
	
	String firstNameString;
	String lastNameString ;
	int age;
	
	public Person() {
		
	}

	public Person(String firstNameString, String lastNameString, int age) {
		
		this.firstNameString = firstNameString;
		this.lastNameString = lastNameString;
		this.age = age;
	}

	public String getFirstNameString() {
		return firstNameString;
	}

	public void setFirstNameString(String firstNameString) {
		this.firstNameString = firstNameString;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	
//	public int compareTo(Person o) {
//		if(this.lastNameString.compareTo(o.lastNameString)==0)
//			return this.firstNameString.compareTo(o.firstNameString);
//		else return this.lastNameString.compareTo(o.lastNameString);
//	}
	
	@Override
	public String toString() {
		return "Person [" + firstNameString + ", " + lastNameString + ", " + age
				+ "]";
	}
	
	
}
