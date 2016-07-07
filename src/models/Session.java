package models;

import java.util.ArrayList;

import exceptions.Creation_Exception;
import models.User;
import models.Compra;

public class Session {
	
	private User user;
	private Compra compra;

	private static ArrayList<String> errors = new ArrayList<String> ();

	public Session(User user, Compra compra) throws Creation_Exception{
		this.user = user;
		this.checkIfValid();
		this.checkCredentials(user.getPassword());
		this.authenticate();
		this.compra = compra;
	}

	public User getUser() {
		return user;
	}
	
	public Compra getCompra() {
		return compra;
	}

	private void checkIfValid() throws Creation_Exception {
		String checkIfValidError = "Usuario e senhas devem ter no minimo 3 digitos.";
		if(this.user.getUsername().length() < 3 || this.user.getPassword().length() < 4){
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
	}
}
