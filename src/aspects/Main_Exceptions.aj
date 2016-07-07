package aspects;

public aspect Main_Exceptions {
	
	declare soft: Exception: (execution(* start*(*))       || 
							  execution(* showLoginMenu()) || 
							  execution(* initRootLayout()));

	pointcut change(): (execution(* start*(*)) 	     || 
						execution(* showLoginMenu()) || 
						execution(* initRootLayout()));
	
	void around (): change() {
		try {
			proceed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
