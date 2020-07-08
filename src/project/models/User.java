package project.models;

public class User extends Person{
	private String username;
	private String password;
	private int role;
	private int scope_id; //kapsam idsi	
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public int getRole() {
		return role;
	}
	public int getScope_id() {
		return scope_id;
	}
	
	public void setUsername(String username, int userId) {
		this.username = username;
	}
	public void setPassword(String password, int userId) {
		this.password = password;
	}
	public void setRole(int role, int userId) {
		this.role = role;
	}
	public void setScope_id(int scope_id, int userId) {
		this.scope_id = scope_id;
	}
	
	
}
