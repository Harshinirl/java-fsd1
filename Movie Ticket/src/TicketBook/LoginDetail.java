package TicketBook;
import java.util.Scanner;
public class LoginDetail {
	void sampleLogin() {
		String Password;
		String Username;
		Username="abcd";
		Password="xyz";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username=sc.next();
		System.out.println("Enter Password: ");
		String password=sc.next();
		if(username.equals(username)&&password.equals(password)) {
			System.out.println("Login successfull");
		}
		else if(username.equals(username)) {
			System.out.println("Invalid username");
		}
		else if(password.equals(password)) {
			System.out.println("Invalid password");
		}
		else {
			System.out.println("Invalid username & password");
		}
		
	}
	
}