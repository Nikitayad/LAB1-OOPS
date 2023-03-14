package com.greatlearning.javafsd.emailapp;
import com.greatlearning.javafsd.emailapp.Employee;
public interface ICredentialService {
String generatePassword();

String generateEmailAddress(Employee employee);
void displayCredentials(Employee employee);
}
