package aspects;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import controllers.MainController;

public aspect UserLoginLog {
	
	pointcut change(MainController a): ( execution(* loginUser*(*))) && this(a);
	
	after(MainController a): change(a) {
		//CRIAR LOG DE USUARIO LOGADOS E DATA DE LOGIN
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		System.out.println(a.currentUser.getUsername() + " " + timeStamp);
		
		File file = new File("src\\logs\\userLogin.txt");
		long begin = System.currentTimeMillis();
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(a.currentUser.getUsername() + " " + timeStamp);
			writer.newLine();
			//Criando o conteúdo do arquivo
			writer.flush();
			//Fechando conexão e escrita do arquivo.
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
