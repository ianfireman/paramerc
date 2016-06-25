package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class MenuController implements Initializable {
	
	@FXML
	private Label usernameMenu;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub	
		usernameMenu.setText(MainController.currentUser.getUsername());
	}	
	
	public void logoutUser(ActionEvent e){
		MainController.currentUser = null;
		Main.showLoginMenu();
	}
}
