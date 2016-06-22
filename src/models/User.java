package models;

import java.util.ArrayList;

import exceptions.UserCreation_Exception;

public class User {
	
	// Atributos //
	
		private String username;
		private String password;
		private int access;
		
		// END Atributos //
		
		private static ArrayList<String> errors = new ArrayList<String> ();
		
		public User(String username, String password, int access) throws UserCreation_Exception {
			this.username = username;
			this.password = password;
			this.access = access;
			this.checkParams();
			this.checkUser();
			this.saveUser();
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
		
		// END Gets Setters //
		
		// private Functions //
		
		private void checkUser() throws UserCreation_Exception {
			String userDuplicateError = "Esse nome de usuario ja esta em uso.";
			//CHECK DATABASE
			if(false){
				errors.add(userDuplicateError);
				throw new UserCreation_Exception(errors);
			}
		}
		
		private void checkParams() throws UserCreation_Exception {
			String usernameErro = "Seu username deve conter no minimo 3 digitos.";
			String passwordErro = "Seu password deve conter no minimo 4 digitos.";
			
			if(username.length() < 3){
				errors.add(usernameErro);
			}
			if(password.length() < 4){
				errors.add(passwordErro);
			}
			if(!errors.isEmpty()){
				throw new UserCreation_Exception(errors);
			}
		}
		
		private void saveUser() throws UserCreation_Exception {
			System.out.println("Usuario Criado");
			//SALVA NO BANCO
		}
		
		// END private Functions //
	}