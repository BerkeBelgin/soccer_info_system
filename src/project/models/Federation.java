package project.models;

import java.util.ArrayList;
import java.util.Queue;

public class Federation {
	private String name;
	private Queue<Person> referees;
	private ArrayList<Club> clubs;
	private Person president;
	private ArrayList<Season> seasons;
	
	public String getName() {
		return name;
	}
	public Person getTopReferee() {
		return referees.peek();
	}
	public Club getClub(int index) {
		return clubs.get(index);
	}
	public Person getPresident() {
		return president;
	}
	public ArrayList<Season> getSeasons() {
		return seasons;
	}
	
	public void addRefree(int userId, Person person) {
		
	}
	public boolean removeRefree(int userId, int id){
		return false;
	}
	
	public void addClub(int userId, Club club) {
		
	}
	public boolean removeClub(int userId, int id){
		return false;
	}
	
	public void addFederationAdmin(int userId, Club club) {
		
	}
	public boolean removeFederationAdmin(int userId, int id){
		return false;
	}
	
	public void addMatch(int userId, Match match) {
		
	}
	public boolean removeMatch(int userId, int id){
		return false;
	}
	public void generateFixture() {
		
	}
}
