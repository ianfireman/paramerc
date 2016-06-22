package exceptions;                                                                                                              
                                                                                                                                 
import java.util.ArrayList;                                                                                                      
                                                                                                                                 
public class UserCreation_Exception extends Exception {                                                                          
	                                                                                                                             
	private ArrayList<String> errors;                                                                                            
                                                                                                                                 
	public UserCreation_Exception(ArrayList<String> errors) {                                                                    
		this.errors = errors;                                                                                                    
	}                                                                                                                            
                                                                                                                                 
	public ArrayList<String> getErrors() {                                                                                       
		return errors;                                                                                                           
	}                                                                                                                            
	                                                                                                                             
                                                                                                                                 
}                                                                                                                                
                                                                                                                                 