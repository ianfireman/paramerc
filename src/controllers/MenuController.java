package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuController implements Initializable {
	
	public Parent parent;
	public Stage stage;
	public Scene scene;
	
	@FXML
	private Label usernameMenu;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			stage = new Stage();
			usernameMenu.setText(MainController.currentUser.getUsername());
			startCaixa();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void startCaixa() throws IOException {
		stage.hide();
		parent = FXMLLoader.load(getClass().getResource("../view/Vw_caixa.fxml"));
		scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();		
	}
	
	public void startEstoque(){
		stage.hide();
		//parent = FXMLLoader.load(getClass().getResource("../view/Vw_estoque.fxml"));
		//scene = new Scene(parent);
		//stage.setScene(scene);
		//stage.show();	
	}
	
	public void startFinanceiro(){
		stage.hide();
		//parent = FXMLLoader.load(getClass().getResource("../view/Vw_financeiro.fxml"));
		//scene = new Scene(parent);
		//stage.setScene(scene);
		//stage.show();	
	}
	
	public void logoutUser(ActionEvent e){
		MainController.currentUser = null;
		stage.hide();
		Main.showLoginMenu();
	}
}
