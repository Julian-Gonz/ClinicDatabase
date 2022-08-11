
public class Employee extends Person {	//Extends Person class, able to get its attributes
	//Creates an Employee
	
	private Date hireDate;
	
	public Employee() {
		this("No name", new Date(1,1,2022));
	}
	
	public Employee(String name, Date hireDate) {
		super(name);
		this.hireDate = hireDate;
	}
	
	public Employee(Employee otherEmployee) {
		super(otherEmployee);
		this.hireDate = otherEmployee.hireDate;
	}
	
	public void setHireDate(Date hireDate) {
		if(hireDate == null) {
			System.out.println("Cannot set hire date.");
		}
		else {
			this.hireDate = hireDate;
		}
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public String toString() {
		return ("The doctor " + super.toString() + " was hired on " +getHireDate());
	}
	
	public boolean equals(Employee otherEmployee) {
		return (super.equals(otherEmployee) && this.hireDate.equals(otherEmployee.hireDate));
	}
}
