package aspects;

import java.io.IOException;

public aspect Initializer_Exceptions {

	declare soft: IOException: (call(* startCaixa()));

	pointcut change(): ( call(* startCaixa()));
	
	void around (): change() {
		try {
			proceed();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
}
