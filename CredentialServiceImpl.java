package com.greatlearning.javafsd.emailapp;
import com.greatlearning.javafsd.emailapp.Employee;
import com.greatlearning.javafsd.emailapp.ICredentialService;
import com.greatlearning.javafsd.emailapp.PasswordGenerator;


public class CredentialServiceImpl
implements ICredentialService {


	@Override
	public String generatePassword() {
		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generate();
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartment();
		StringBuilder emailBuilder = new StringBuilder();
		emailBuilder.append(firstName.toLowerCase());
		emailBuilder.append(".");
		emailBuilder.append(lastName.toLowerCase());
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".abc.com");
		String emailAddress = emailBuilder.toString();
				employee.setEmailAddress(emailAddress);
		// TODO Auto-generated method stub
		return emailAddress;
	}

	@Override
	public void displayGenerateCredentials(Employee employee) {
		// TODO Auto-generated method stub
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Dear");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(",your generated credentials are as follows");
		
		String newline = System.getProperty("line.separator");
		messageBuilder.append(newline);
		messageBuilder.append("Email -->");
		messageBuilder.append(employee.getEmailAddress());
		messageBuilder.append(newline);
		messageBuilder.append("your password-->");
		messageBuilder.append(employee.getPassword());
		String finalMessage = messageBuilder.toString();
		System.out.println(finalMessage);
	}

	public void displayCredentials(Employee nikita) {
		// TODO Auto-generated method stub
		
	}
}