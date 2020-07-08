package project.views;
import java.util.Map;
import java.util.Scanner;
import project.models.Federation;

public class ClubPage extends Page{
	Federation federation;
	
	public ClubPage(Federation federation) {
		this.federation=federation;
	}
	
	@Override
	public void buildPage() {
		super.buildPage();
		System.out.println("0 - Previous Page");
		for(int i=0;i<federation.getClubAmount();++i) {
			System.out.println((i+1)+" - "+federation.getClub(i).getName());
		}
		
		Scanner sc = new Scanner(System.in);
		String in;
		int choice;
		do {
			System.out.println("Which team do you want to look for ?(Enter the number of the team.)");
			in=sc.nextLine();
			choice=(Integer.parseInt(in));
		}while(choice < 0 || choice >= federation.getClubAmount());
		
		sc.close();
		if(choice == 0) {
			ChooseFederationPage cfp=new ChooseFederationPage();
			cfp.buildPage();
		}
		TeamInfoPage teamInfo=new TeamInfoPage(federation.getClub(choice-1),federation);
		teamInfo.buildPage();
		
	}
	
	
	
	
}
