package emailApp;

// You are an IT support administrator specialist and are charged with the task of creating email accounts for new hires

/*
 * Generate an email with the following syntax: firstname.lastname@department.company.com
 * Determine the department (sales, development, accounting), if none leave blank
 * Generate a random string for a password
 * Have set methods to change the passwords, set the mailbox capacity, and define an alternative email address
 * Have get methods to display the name, email, and mailbox capacity
 */

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Aliyan", "Hidayatallah");
		System.out.println(em1.showInfo());
		
		//em1.setAlternateEmail(example);
		//System.out.println(em1.getAlternateEmail());
	}

}
