package project1;

public class Lab3_Person {
	private String name = "handsome";
	private int age = 18;
	private String gender = "male";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

class Employee extends Lab3_Person{
	private byte employeeId = 127;

	public byte getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(byte employeeId) {
		this.employeeId = employeeId;
	}
	
}
