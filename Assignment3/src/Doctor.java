
public class Doctor extends SalariedEmployee {	//Extends SalariedEmployee class, able to use its attributes
	//Creates a Doctor
	
	private String doctorSpecialty;
	private double fee;
	
	public Doctor() {
		super();
		doctorSpecialty = "No specialty";
		fee = 0.0;
	}
	
	public Doctor(String name, Date hireDate, double salary, String doctorSpecialty, double fee) {
		super(name, hireDate, salary);
		this.doctorSpecialty = doctorSpecialty;
		this.fee = fee;
	}
	
	public Doctor(Doctor otherDoctor) {
		super(otherDoctor);
		this.doctorSpecialty = otherDoctor.doctorSpecialty;
		this.fee = otherDoctor.fee;
	}
	
	public void setDoctorSpecialty(String doctorSpecialty) {
		if(doctorSpecialty == null) {
			System.out.println("Cannot set doctorSpecialty.");
		}
		else {
			this.doctorSpecialty = doctorSpecialty;
		}
	}
	
	public String getDoctorSpecialty() {
		return doctorSpecialty;
	}
	
	public void setFee(double fee) {
		if(fee >=0) {
			this.fee = fee;
		}
		else {
			System.out.println("Cannot set fee.");
		}
	}
	
	public double getFee() {
		return fee;
	}
	
	public String toString() {
		return (super.toString() + "The specialty is " + doctorSpecialty 
				+ " and visit fee is $" + fee);
	}
	
	public boolean equals(Doctor otherDoctor) {
		return (super.equals(otherDoctor) && this.doctorSpecialty.equals(otherDoctor.doctorSpecialty)
				&& this.fee == otherDoctor.fee);
	}
}
