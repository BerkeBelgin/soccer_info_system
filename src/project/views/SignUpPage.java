package project.views;

import java.util.Scanner;

import project.models.Football;

public class SignUpPage extends Page{
	 @Override
	public void buildPage() {
		 Scanner scn = new Scanner(System.in);
			int choice = 0;
			
			do {
				System.out.println("1) Sign Up ");
				System.out.println("2) Log In ");
				System.out.println("3) Quit");
				choice = scn.nextInt();
				
				switch (choice) {
				case 1:
					System.out.print("username: ");
					String username = scn.nextLine();
					System.out.println("password: ");
					String password = scn.nextLine();
					if(!Football.userExists(username, password)) {
						Football.addUser(username, password);
						Football.identity = username;
						HomePage hp = new HomePage();
						hp.buildPage();
					}
					break;
				case 2:
					SignUpPage sp = new SignUpPage();
					sp.buildPage();
					break;
				}
			} while(choice != 3);
	}
}
