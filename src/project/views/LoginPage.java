package project.views;

import java.util.HashMap;
import java.util.Map;

public class LoginPage extends Page {
	
	@Override
	public void buildPage() {
		super.buildPage();
		
		Map<String, String> identity = new HashMap<String, String>();
		
		HomePage hp = new HomePage(identity);
		hp.buildPage();
	}
}
