package aspects;

import java.util.ArrayList;
import models.Session;
import models.User;
import exceptions.Creation_Exception;

public aspect Sessions_Validation {

	private static ArrayList<String> errors = new ArrayList<String> ();
	
	public void Session.checkIfValid(User user) throws Creation_Exception {
		String checkIfValidError = "Usuario e senhas devem ter no minimo 3 digitos.";
		if(user.getUsername().length() < 3 || user.getPassword().length() < 4){
			errors.add(checkIfValidError);
			throw new Creation_Exception(errors);
		}
	}

	public void Session.checkCredentials(String password) throws Creation_Exception {
		String credentialsError = "Senha ou Usuario invalidos.";
		//CHECK DATABASE
		if(false){
			errors.add(credentialsError);
			throw new Creation_Exception(errors);
		}
	}
	
	public void Session.authenticate() {
		int id = 123; //vai ser pego no banco
	}

}
