
public class Patient extends Person {	//Extends Person class, able to use its attributes
	//Creates a patient
	
	private Doctor doctor;
	
	public Patient() {
		this("No name", new Doctor("No name", new Date(1,1,2022), 0.0, "No specialty", 0.0));
	}
	
	public Patient(String name, Doctor doctor) {
		super(name);
		this.doctor = doctor;
	}
	
	public Patient(Patient otherPatient) {
		super(otherPatient);
		this.doctor = otherPatient.doctor;
	}
	
	public void setDoctor(Doctor doctor) {
		if(doctor == null){
			System.out.println("Cannot set the doctor.");
		}
		else {
			this.doctor = doctor;
		}
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public String toString() {
		return ("The name is " + super.toString() + ", Primary doctor is: " + doctor.getName());
	}
	
	public boolean equals(Patient otherPatient) {
		return (super.equals(otherPatient) && this.doctor.equals(otherPatient.doctor));
	}
		
}
