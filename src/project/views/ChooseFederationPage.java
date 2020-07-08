package project.views;

import java.util.Scanner;

import project.models.Football;

public class ChooseFederationPage extends Page {
	 @Override
	public void buildPage() {
		super.buildPage();
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i < Football.federations.get(i).size(); i++) {
			System.out.println( i + ") " + Football.federations.get(i).getName());
		}
		System.out.print("federation id: ");
		int choice = scn.nextInt();	
		if(choice < Football.federations.get(choice).size()) {
			FederationPage fp = new FederationPage();
			fp.buildPage();
		}	
		scn.close();
	}
}
