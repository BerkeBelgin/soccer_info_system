import project.models.Football;
import project.views.LoginPage;

public class Main {

	public static void main(String[] args) {
		Football.readStateFromFile();
		LoginPage loginPage = new LoginPage();
		loginPage.buildPage();
		Football.saveStateToFile();
	}

}
