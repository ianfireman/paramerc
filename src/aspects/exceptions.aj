package aspects;

import java.io.IOException;

import controllers.MainController;
import exceptions.Creation_Exception;

public aspect exceptions {
	
	declare soft: Creation_Exception: ( execution(* loginUser(*)));
	declare soft: IOException: ( execution(* loginUser(*)));
	
	pointcut change(MainController a): ( execution(* loginUser*(*))) && this(a);
	
	void around (MainController a): change(a) {
		try {
			proceed(a);
		} catch (Creation_Exception e) {
			a.getLoginAlert().setText(e.getErrors().toString());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
