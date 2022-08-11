
public class Billing {	//Gets the patient, their doctor and the bill
	//Creates the bill
	
	private Patient patientOfClinic;
	private Doctor doctorOfClinic;
	private double bill;
	
	public Billing() {
		this(new Patient("No name", new Doctor("No name", new Date(1,1,2022), 0.0, "No specialty", 0.0)),
				new Doctor("No name", new Date(1,1,2022), 0.0, "No specialty", 0.0), 0.0);
	}
	
	public Billing(Patient patientOfClinic, Doctor doctorOfClinic, double bill) {
		this.patientOfClinic = patientOfClinic;
		this.doctorOfClinic = doctorOfClinic;
		this.bill = bill;
	}
	
	public Billing(Billing otherBilling) {
		this.patientOfClinic = otherBilling.patientOfClinic;
		this.doctorOfClinic = otherBilling.doctorOfClinic;
		this.bill = otherBilling.bill;
	}

	public Patient getPatientOfClinic() {
		return patientOfClinic;
	}

	public void setPatientOfClinic(Patient patientOfClinic) {
		this.patientOfClinic = patientOfClinic;
	}

	public Doctor getDoctorOfClinic() {
		return doctorOfClinic;
	}

	public void setDoctorOfClinic(Doctor doctorOfClinic) {
		this.doctorOfClinic = doctorOfClinic;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public String toString() {
		return ("Patient: " + patientOfClinic.getName() + "\nDoctor: " 
				+ doctorOfClinic.getName() + "\nAmount Due: $" + bill);
	}
	
	public boolean equals(Billing otherBilling) {
		return (this.patientOfClinic.equals(otherBilling.patientOfClinic) 
				&& this.doctorOfClinic.equals(otherBilling.doctorOfClinic)
				&& this.bill == otherBilling.bill);
	}
}
