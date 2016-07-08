package models;

import java.util.ArrayList;

import exceptions.Creation_Exception;
import models.User;
import models.Compra;

public class Session {
	
	private User user;
	private Compra compra;

	public Session(User user, Compra compra) throws Creation_Exception{
		this.user = user;
		checkIfValid(user);
		checkCredentials(user.getPassword());
		authenticate();
		this.compra = compra;
	}

	public User getUser() {
		return user;
	}
	
	public Compra getCompra() {
		return compra;
	}
}
