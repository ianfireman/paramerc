package application;
	
import javafx.geometry.Rectangle2D;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private BorderPane rootLayout;
	private Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage  = primaryStage;
			BorderPane root = new BorderPane();
			Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
	        //set Stage boundaries to visible bounds of the main screen
			
			System.out.println(primaryScreenBounds.getWidth()*0.2);
			System.out.println(primaryScreenBounds.getHeight());
			
			initRootLayout();

			showLoginMenu();

			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showLoginMenu(){
		try{
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("../views/Vw_Login.fxml"));
	        AnchorPane login = (AnchorPane) loader.load();
	        rootLayout.setCenter(login);	
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void initRootLayout(){
		try{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../views/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
            primaryStage.show();
		} catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
