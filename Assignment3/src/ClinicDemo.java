
public class ClinicDemo {

	public static void main(String[] args) {
		//Creates doctor, patient, and billing objects and display the info
		
		Doctor bob = new Doctor("Bob", new Date(11,13,1992), 120000, "Dermatologist", 25);
		Doctor susan = new Doctor("Susan", new Date(3,8,1995), 95000, "Immunologist", 15);
		Doctor lilly = new Doctor("Lilly", new Date(6,2,2002), 115000, "Nephrologist", 50);
		Patient fred = new Patient("Fred", bob);
		Patient sally = new Patient("Sally", susan);
		Patient john = new Patient("John", lilly);
		Billing due = new Billing(fred, bob, 21);
		Billing tab = new Billing(sally, susan, 25.5);
		Billing amount = new Billing(john, lilly, 90.5);
		
		System.out.println(bob + "\n");
		System.out.println(susan + "\n");
		System.out.println(lilly);

		System.out.println("\n*Patient's Information*");
		System.out.println(fred + "\n");
		System.out.println(sally + "\n");
		System.out.println(john);
		
		System.out.println("\n*Billings's Information*");
		System.out.println(due + "\n");
		System.out.println(tab + "\n");
		System.out.println(amount + "\n");
		
		double total = due.getBill() + tab.getBill() + amount.getBill();
		System.out.println("\nThe total income from billing records is: $" + total);
		
	}
}
