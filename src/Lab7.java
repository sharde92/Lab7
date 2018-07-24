import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab7 {

	public static void main(String[] args) {
		
		//Creates scanner
		Scanner scnr = new Scanner(System.in);
		
		//Prompts user for a name and calls/prints nameValidator method
		System.out.println("Please enter a valid name: ");
		String myName = scnr.next();
		System.out.println(nameValidator(myName));
		
		//Prompts user for an email and calls/prints emailValidator method
		System.out.println("Please enter a valid email: ");
		String myEmail = scnr.next();
		System.out.println(emailValidator(myEmail));
		
		//Prompts user for a phone number and calls/prints phoneNumValidator method
		System.out.println("Please enter a valid phone number: ");
		String myNumber = scnr.next();
		System.out.println(phoneNumValidator(myNumber));
		
		//Prompts user for a date and calls/prints dateValidator
		System.out.println("Please enter a valid date (dd/mm/yyyy): ");
		String myDate = scnr.next();
		System.out.println(dateValidator(myDate));
		
		
		scnr.close();
	}

	
	public static String nameValidator(String name) {
		
		//Creates an instance of the pattern and matcher classes for the valid name specifications 
		Pattern validName = Pattern.compile("^[A-Z][a-z]{0,29}$");
		Matcher match = validName.matcher(name);
		
		//If regex pattern is found, a validation message is returned
		if (match.find()) {
			return name + " is a valid name.";
		}
		//If pattern is not found, a failure to validate message is returned
		else {
			return "Sorry, " + name + " is not a valid name!";
		}
		
	
	}
	
	public static String emailValidator(String email) {
		
		//Creates an instance of the pattern and matcher classes for the valid email specifications 
		Pattern validEmail = Pattern.compile("[A-Z0-9]{5,30}@[A-Z0-9]{5,10}[.][A-Z0-9]{2,3}", Pattern.CASE_INSENSITIVE);
		Matcher match = validEmail.matcher(email);
		
		//If regex pattern is found, a validation message is returned
		if (match.find()) {
			return email + " is a valid email!";
		}
		
		//If pattern is not found, a failure to validate message is returned
		else {
			return "Sorry, " + email + " is an invalid email!";
		}
	}

	public static String phoneNumValidator(String phoneNum) {
		
		//Creates an instance of the pattern and matcher classes for the valid phone number specifications 
		Pattern validPhoneNum = Pattern.compile("^\\d{3}-\\d{3}-\\d{4}$");
		Matcher match = validPhoneNum.matcher(phoneNum);
		
		//If regex pattern is found, a validation message is returned
		if (match.find()) {
			return phoneNum + " is a valid phone number!";
		}
		//If pattern is not found, a failure to validate message is returned
		else {
			return "Sorry, " + phoneNum + " is an invalid phone number!";
		}
	}


	public static String dateValidator(String date) {
		
	//Creates an instance of the pattern and matcher classes for the valid date specifications 	
	Pattern validDate = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
	Matcher match = validDate.matcher(date);
	
	//If regex pattern is found, a validation message is returned
	if (match.find()) {
		return date + " is a valid date!";
	}
	//If pattern is not found, a failure to validate message is returned
	else {
		return "Sorry, " + date + " is not a valid date!";
	}
	}
}
