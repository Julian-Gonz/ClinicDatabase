
public class Person {	//Creates a Person
	
	private String name;	//Attribute created
	
	public Person() {
		name = "No name";
	}
	
	public Person(String name) {
		if(name == null) {
			System.out.println("Error creating the person.");
			System.exit(0);
		}
		
		this.name = name;
	}
	
	public Person(Person otherPerson) {
		if(otherPerson == null) {
			System.out.println("Error creating the person.");
			System.exit(0);
		}
		
		this.name = otherPerson.name;
	}
	
	public void setName(String name) {
		if(name == null) {
			System.out.println("Cannot set name.");
		}
		else {
		this.name = name;
	  }
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return (getName());
	}
	
	public boolean equals(Person otherPerson) {
		return (this.name.equals(otherPerson.name));
	}

}
