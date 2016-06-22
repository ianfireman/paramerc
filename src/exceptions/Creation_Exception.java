package exceptions;                                                                                                              
                                                                                                                                 
import java.util.ArrayList;                                                                                                      
                                                                                                                                 
public class Creation_Exception extends Exception {                                                                          
	                                                                                                                             
	private ArrayList<String> errors;                                                                                            
                                                                                                                                 
	public Creation_Exception(ArrayList<String> errors) {                                                                    
		this.errors = errors;                                                                                                    
	}                                                                                                                            
                                                                                                                                 
	public ArrayList<String> getErrors() {                                                                                       
		return errors;                                                                                                           
	}                                                                                                                            
	                                                                                                                             
                                                                                                                                 
}                                                                                                                                
                                                                                                                                 