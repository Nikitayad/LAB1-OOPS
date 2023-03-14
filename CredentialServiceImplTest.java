import com.greatlearning.javafsd.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapp.Employee;	
import com.greatlearning.javafsd.emailapp.PasswordGenerator;
public class CredentialServiceImplTest {
public static void main (String[] args) {
	//testEmailAddressGeneration();
	//testPasswordGeneration();
	testdisplayCredentials();
}
	public static void testEmailAddressGeneration() {
	// TODO Auto-generated method stub
		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();
		Employee nikita = new Employee("nikita","yadav","technical");
		String emailAddress = serviceImpl.generateEmailAddress(nikita);
		
		System.out.println(emailAddress);

}
	public static void testPasswordGeneration() {
	
	CredentialServiceImpl serviceImpl = 
			new CredentialServiceImpl();

String password = serviceImpl.generatePassword();
	System.out.println("Password ->" + password);
	
}
 public static void testdisplayCredentials() {
		

		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();

		Employee nikita = new Employee("Nikita", "Yadav", "technical");
		
		serviceImpl.generateEmailAddress(nikita);
		String password = serviceImpl.generatePassword();
		nikita.setPassword(password);
		
		serviceImpl.displayCredentials(nikita);	
}
}
