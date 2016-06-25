package models;

import java.util.ArrayList;

import exceptions.Creation_Exception;

public class Session {
	
	private String username;
	private int id;

	private static ArrayList<String> errors = new ArrayList<String> ();

	public Session(String username, String password) throws Creation_Exception{
		this.username = username;
		this.checkIfValid(password);
		this.checkCredentials(password);
		this.authenticate();
	}

	public String getUsername() {
		return username;
	}
	
	public int getId() {
		return id;
	}
	

	private void checkIfValid(String password) throws Creation_Exception {
		String checkIfValidError = "Usuario e senhas devem ter no minimo 3 digitos.";
		if(this.username.length() < 3 || password.length() < 3){
			errors.add(checkIfValidError);
			throw new Creation_Exception(errors);
		}
	}

	private void checkCredentials(String password) throws Creation_Exception {
		String credentialsError = "Senha ou Usuario invalidos.";
		//CHECK DATABASE
		if(false){
			errors.add(credentialsError);
			throw new Creation_Exception(errors);
		}
	}
	
	private void authenticate() {
		int id = 123; //vai ser pego no banco
		this.id = id;
	}
}
