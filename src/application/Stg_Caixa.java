package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Stg_Caixa extends Application{

	private Stage caixa;
	private AnchorPane rootCaixa;
	
	
	@Override
	public void start(Stage caixa) throws Exception {
		// TODO Auto-generated method stub
		try{
			this.caixa = caixa;
			
			Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
			caixa.setX(primScreenBounds.getWidth()*0.003); 
			caixa.setY(primScreenBounds.getHeight()*0.005);
			caixa.setWidth(primScreenBounds.getWidth()*0.2);
			caixa.setHeight(primScreenBounds.getHeight()*0.99);
			initRootCaixa();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private void showDefaultButtons(){
		try{
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("../view/Vw_Default_Buttons.fxml"));
	        AnchorPane login = (AnchorPane) loader.load();
	        
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void initRootCaixa(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/Vw_Caixa.fxml"));
			
			rootCaixa = (AnchorPane) loader.load();
			caixa.setResizable(false);
			Scene scene = new Scene(rootCaixa);
			caixa.setScene(scene);
            caixa.show();
		} catch (IOException e) {
            e.printStackTrace();
        }
	}

}
