package models;

import java.util.ArrayList;

import exceptions.userAlreadyExists;

public class User {
	
	private String username;
	private String password;
	private int access;
	
	private static ArrayList<String> errors = new ArrayList<String> ();
	
	public User(String username, String password, int access) throws userAlreadyExists{
		boolean userExists;
		this.username = username;
		this.password = password;
		this.access = access;
		this.checkParams();
		userExists = this.checkUser();
		newUser(userExists, this);
	}

	private void checkParams() {
		String usernameErro = "Seu username deve conter no minimo 4 digitos";
		String passwordErro = "Seu password deve conter no minimo 4 digitos";
		
		if(username.length() < 4){
			errors.add(usernameErro);
		}
		if(password.length() < 4){
			errors.add(passwordErro);
		}
	}

	private boolean checkUser() {
		//CHECK DATABASE
		return false;
	}
	
	private void newUser(boolean userExists, User user) throws userAlreadyExists {
		if(userExists){
			throw new userAlreadyExists();
		} else {
			//SALVA NO BANCO
		}
	}

}
