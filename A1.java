package Project;

import java.util.Scanner;

import Project.A1;
import Project.A2;

public class A1 extends A2 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);	
		String USERNAME = "YERRINATH";
		String PASSWORD = "REDDY";
		String user;
		System.out.println("USERNAME : ");
		user =Sc.nextLine();
		System.out.println("PASSWORD : ");
		String pass = Sc.nextLine();
		if ( user.equals(USERNAME)) {
			if(pass.equals(PASSWORD)) {
				A2 r3 = new A2();
				r3.inner1();
				r3.total();
				r3.push();
			}
			else {
				System.out.println("password  entered is wrong");
			}	
		}
		else {
		System.out.println("username entered is wrong");
		}
	}	
}