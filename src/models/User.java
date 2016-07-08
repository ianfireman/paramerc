package models;

import exceptions.Creation_Exception;

public class User {
	
	// Atributos //
	
	private String username;
	private String password;
	private int access;
	
	// END Atributos //
	
	public User(String username, String password, int access) throws Creation_Exception {
		this.username = username;
		this.password = password;
		this.access = access;
		checkParams(this);
		checkUser(this);
		saveUser(this);
	}
	
	// Gets Setters //

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccess() {
		return access;
	}

	public void setAccess(int access) {
		this.access = access;
	}
}