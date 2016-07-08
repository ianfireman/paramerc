package aspects;

import java.util.ArrayList;

import exceptions.Creation_Exception;
import models.User;

public aspect User_Validation {
	
	private static ArrayList<String> errors;
	
	public void User.checkUser(User user) throws Creation_Exception {
		String userDuplicateError = "Esse nome de usuario ja esta em uso.";
		//CHECK DATABASE
		if(false){
			errors.add(userDuplicateError);
			throw new Creation_Exception(errors);
		}
	}
	
	public void User.checkParams(User user) throws Creation_Exception {
		String usernameErro = "Seu username deve conter no minimo 3 digitos.";
		String passwordErro = "Seu password deve conter no minimo 4 digitos.";
		errors = new ArrayList<String> ();
		if(user.getUsername().length() < 3){
			errors.add(usernameErro);
		}
		if(user.getPassword().length() < 4){
			errors.add(passwordErro);
		}
		if(!errors.isEmpty()){
			throw new Creation_Exception(errors);
		}
	}
	
	public void User.saveUser(User user) throws Creation_Exception {
		System.out.println("Usuario Criado");
		//SALVA NO BANCO
	}
	
}
