package exceptions;

public class Item_Exception extends Exception {
	
	private String message;
	private String header;
	
	public Item_Exception() {                                                                    
		this.header = "Item inexistente";                                                        
		this.message = "Temos apenas 55 itens disponiveis";                                                                                           
	}  
	
	public String getMessage() {                                                                                       
		return message;                                                                                                           
	} 
	
	public String getHeader() {                                                                                       
		return header;                                                                                                           
	}    
}
