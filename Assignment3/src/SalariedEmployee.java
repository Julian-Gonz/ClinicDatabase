
public class SalariedEmployee extends Employee {	//Extends Employee class, able to use its attributes
	//Creates a Salaried Employee
	
	private double salary;

	public SalariedEmployee() {
		this("No name", new Date(1,1,2022), 0.0);
	}
	
	public SalariedEmployee(String name, Date hireDate, double salary) {
		super(name, hireDate);
		this.salary = salary;
	}
	
	public SalariedEmployee(SalariedEmployee otherEmployee) {
		super(otherEmployee);
		this.salary = otherEmployee.salary;
	}
	
	public void setSalary(double salary) {
		if(salary >= 0) {
			this.salary = salary;
		}
		else {
			System.out.println("Cannot set salary.");
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return (super.toString() + " with a salary of $" +getSalary() + "\n");
	}
	
	public boolean equals(SalariedEmployee otherEmployee) {
		return (super.equals(otherEmployee) && this.salary == otherEmployee.salary);
	}
}
