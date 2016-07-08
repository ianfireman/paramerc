package exceptions;

public class Validade_Exception extends Exception {
	
	private String message;
	private String header;
	
	public Validade_Exception() {                                                                    
		this.header = "Esse item esta fora da validade";                                                        
		this.message = "Desculpe pelo transtorno!";                                                                                           
	}  
	
	public String getMessage() {                                                                                       
		return message;                                                                                                           
	} 
	
	public String getHeader() {                                                                                       
		return header;                                                                                                           
	} 

}
