

public class Faculty extends Employee {
	//instance variables
	//to keep track of the department to which this faculty belongs
	private String department;
	
	//default constructor
	//call the default constructor of the parent class
	//setDepartment to empty string
	public Faculty() {
		super(); //call the default constructor of the parent class (Employee)
		department = ""; 
	}
	
	//build at least 6 more constructors which are unique Faculty
	public Faculty(String facultyName, int facultyId, String facultyDepartment) {
		super(facultyName,facultyId);
		setDepartment(facultyDepartment);
	}
	
	public Faculty(String facultyName) {
		super(facultyName);
		department = "";
	}
	
	public Faculty(String facultyName, int facultyId) {
		super(facultyName,facultyId);
		department = "";
	}
	
	public Faculty(String facultyName, String facultyDepartment) {
		super(facultyName);
		department = facultyDepartment;
	}
	
	public Faculty(int facultyId, String facultyDepartment) {
		super(facultyId);
		department = facultyDepartment;
	}
	
	/*public Faculty(String facultyDepartment) {
		super();
		department = "";
	}*/
	
	
	//setDepartment to the value sent to the parameter newDepartment
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	
	//getDepartment to return the value stored in the instance variable department
	public String getDepartment() {
		return department;
	}
	
	//override the toString method from the Employee class to return name,employee id, and department
	public String toString() {
		//return "Name: " + getName() + " Employee Id: " + getEmployeeId() + " Department: " + department;
		return super.toString() + "\n" + "Department: " + department;
	}
	
	//override the equals method from the Employee class to compare all 3 instance variables
	//if they are all the same return true, otherwise return false
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Faculty) {
			Faculty otherFaculty = (Faculty)otherObject;
			if(super.equals(otherObject) && 
					this.department.equals(otherFaculty.department)) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	} 
}
