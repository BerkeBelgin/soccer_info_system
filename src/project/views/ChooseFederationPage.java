package project.views;

import java.util.Scanner;

import project.models.Football;

public class ChooseFederationPage extends Page {
	 @Override
	public void buildPage() {
		super.buildPage();
		Scanner scn = new Scanner(System.in);
		int choice=0,i=0;
		for(i = 0; i < Football.federations.size(); i++) {
			System.out.println((i) + " - " + Football.federations.get(i).getName());
		}
		System.out.println((Football.federations.size()+1)+ " - " + Football.federations.get(i).getName());
		do {
			choice=scn.nextInt();
			choice--;
		}while(choice < 0 || choice > Football.federations.size());
		
		if(choice == Football.federations.size()) {
			SignUpPage sup=new SignUpPage();
			sup.buildPage();
		}
		if(choice < Football.federations.size()) {
			FederationPage fp = new FederationPage(Football.federations.get(choice));
			fp.buildPage();
		}	
		scn.close();
	}
}
