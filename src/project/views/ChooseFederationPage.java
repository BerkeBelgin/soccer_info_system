package project.views;

import java.util.Scanner;

import project.models.Football;

public class ChooseFederationPage extends Page {
	private Scanner scnnr;
	
	public ChooseFederationPage(Scanner scnnr) {
		this.scnnr = scnnr;
	}
	 @Override
	public void buildPage() {
		super.buildPage();
		int choice=0;
		for(int i = 0; i < Football.federations.size(); i++) {
			System.out.println((i) + " - " + Football.federations.get(i).getName());
		}
		
		do {
			choice= Integer.parseInt(scnnr.nextLine());
			choice--;
		}while(choice < 0 || choice > Football.federations.size());
		
		if(choice == Football.federations.size()) {
			SignUpPage sup=new SignUpPage(scnnr);
			sup.buildPage();
		}
		if(choice < Football.federations.size()) {
			FederationPage fp = new FederationPage(scnnr, Football.federations.get(choice));
			fp.buildPage();
		}
	}
}
