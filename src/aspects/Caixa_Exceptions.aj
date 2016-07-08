package aspects;

import java.text.ParseException;

import exceptions.Item_Exception;
import exceptions.Validade_Exception;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public aspect Caixa_Exceptions {
	
	declare soft: Exception: ( execution(* AdicionarItem(*)));
	
	pointcut change(): ( execution(* AdicionarItem*(*)));
	
	void around (): change() {
		try {
			proceed();
		} catch (Item_Exception e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText(e.getHeader());
			alert.setContentText(e.getMessage());

			alert.showAndWait();
		} catch (NumberFormatException e){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("So numeros são aceitos");

			alert.showAndWait();
		} catch (Validade_Exception e){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText(e.getHeader());
			alert.setContentText(e.getMessage());

			alert.showAndWait();
		} catch (ParseException e){
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Algum erro ocorreu");

			alert.showAndWait();
		}
	}
}
