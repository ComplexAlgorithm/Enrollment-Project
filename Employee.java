

public class Employee extends Person { //Employee is inheriting from the Person
	//instance variables
	private int employeeId;
	
	//default constructor
	public Employee() {
		super(); //call to the default constructor of the parent class (Person)
		employeeId = 0;
	}
	
	public Employee(String employeeName) {
		super(employeeName); //calls the second/overloaded constructor of person
		employeeId = 0;
	}
	
	public Employee(String employeeName, int newEmployeeId) {
		super(employeeName);
		setEmployeeId(newEmployeeId);
		//if(newEmployeeId > 0) {
		//	employeeId = newEmployeeId;
		//}
	}
	
	public Employee(int newEmployeeId) {
		super();
		setEmployeeId(newEmployeeId);
	}
	
	//non-static methods
	public void setEmployeeId(int newEmployeeId) {
		if(newEmployeeId > 0) {
			employeeId = newEmployeeId;
		}
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	//override the toString method from person class to return the name and the employee id
	public String toString() {
		//return "Name: " + getName() + " Employee Id: " + employeeId;
		//return "Name: "+ super.getName() + " Employee Id: " + employeeId;
		return super.toString() + "\n" + "Employee Id: " + employeeId;
	}
	
	
	//override the equals method from the Person class to make sure
	//the employee has the same name and the same employee id and if so 
	//return true, otherwise return false
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Employee) {
			Employee otherEmployee = (Employee)otherObject;
			if(this.getName().equals(otherEmployee.getName()) && //super.equals(otherObject)
					this.employeeId == otherEmployee.employeeId) {
						areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}
}