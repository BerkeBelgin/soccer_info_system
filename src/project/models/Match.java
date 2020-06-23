package project.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Match {
	private LocalDateTime matchDate;
	private boolean isPlayed;
	private Person referee;
	private Club home;
	private Club away;
	private int homeScore;
	private int awayScore;
	private ArrayList<Player> homeTopEleven;
	private ArrayList<Player> homeSubstitutes;
	private ArrayList<Player> awayTopEleven;
	private ArrayList<Player> awaySubstitutes;
	
	
	public LocalDateTime getMatchDate() {
		return matchDate;
	}
	public boolean isPlayed() {
		return isPlayed;
	}
	public Person getReferee() {
		return referee;
	}
	public Club getHome() {
		return home;
	}
	public Club getAway() {
		return away;
	}
	public int getHomeScore() {
		return homeScore;
	}
	public int getAwayScore() {
		return awayScore;
	}
	public ArrayList<Player> getHomeTopEleven() {
		return homeTopEleven;
	}
	public ArrayList<Player> getHomeSubstitutes() {
		return homeSubstitutes;
	}
	public ArrayList<Player> getAwayTopEleven() {
		return awayTopEleven;
	}
	public ArrayList<Player> getAwaySubstitutes() {
		return awaySubstitutes;
	}
	
	public void setMatchDate(int userId, LocalDateTime matchDate) {
		this.matchDate = matchDate;
	}
	public void setPlayed(int userId, boolean isPlayed) {
		this.isPlayed = isPlayed;
	}
	public void setReferee(int userId, Person referee) {
		this.referee = referee;
	}
	public void setHome(int userId, Club home) {
		this.home = home;
	}
	public void setAway(int userId, Club away) {
		this.away = away;
	}
	public void setHomeScore(int userId, int homeScore) {
		this.homeScore = homeScore;
	}
	public void setAwayScore(int userId, int awayScore) {
		this.awayScore = awayScore;
	}
	public void setHomeTopEleven(int userId, ArrayList<Player> homeTopEleven) {
		this.homeTopEleven = homeTopEleven;
	}
	public void setHomeSubstitutes(int userId, ArrayList<Player> homeSubstitutes) {
		this.homeSubstitutes = homeSubstitutes;
	}
	public void setAwayTopEleven(int userId, ArrayList<Player> awayTopEleven) {
		this.awayTopEleven = awayTopEleven;
	}
	public void setAwaySubstitutes(int userId, ArrayList<Player> awaySubstitutes) {
		this.awaySubstitutes = awaySubstitutes;
	}
}
