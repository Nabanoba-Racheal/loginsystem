package loginsystem;
import java.util.Scanner;

public class Loginsystem {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	System.out.println("Login System");
	
	String correct_username="Racheal";
	String correct_password="12345";
	
	for(int attempts=1;attempts<=3;attempts++) {
		System.out.println("Attempt"+attempts +":Enter your username");
	
//	System.out.println("Enter Your Username");
	String username=input.nextLine();
	
	System.out.println("Enter Your password");
	String password=input.nextLine();
	
	if(username.equals(correct_username)&&password.equals(correct_password)) {
		System.out.println("Login successful" );
		break;
		
	}else {
		System.out.println("login unsuccessful Try again");
	}
	if(attempts==3){
		System.out.println("Maximum attempts reached. Access denied.");
	}
	}
	}
	

	}


