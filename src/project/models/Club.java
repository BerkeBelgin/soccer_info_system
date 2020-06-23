package project.models;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Club {
	private int id;
	private String name;
	private Person president;
	private Person coach;
	private ArrayList<Person> healthOfficers;
	private ArrayList<Player> players;
	private PriorityQueue<Player> playersByGoals;
	
	public Club() {
		this.healthOfficers = new ArrayList<Person>();
		this.players = new ArrayList<Player>();
		this.playersByGoals = new PriorityQueue<Player>();
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Person getPresident() {
		return president;
	}
	public Person getCoach() {
		return coach;
	}
	public Person getHealthOfficer(int index) {
		return healthOfficers.get(index);
	}
	public Player getPlayer(int index) {
		return players.get(index);
	}
	public Player getTopPlayer() {
		return playersByGoals.peek();
	}

	public void setPresident(int role, Person president) {
		
	}
	
	public void setCoach(int role, Person coach) {
		
	}
	
	public void addHealthOfficer(int role, Person person) {
		
	}
	public void addPlayer(int role, Player player) {
		
	}
	public void addClubAdmin(int role, User admin) {
		
	}
	
	public void setHealthOfficer(int role, Person person, int id) {
		
	}
	public void setPlayer(int role, Player player, int id) {
		
	}
	public void setClubAdmin(int role, User admin, int id) {
		
	}
	
	public void removeHealthOfficer(int role, int id) {
		
	}
	public void removePlayer(int role, int id) {
		
	}
	public void removeClubAdmin(int role, int id) {
		
	}
}
