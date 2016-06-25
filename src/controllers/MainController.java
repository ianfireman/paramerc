package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import exceptions.Creation_Exception;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import models.Session;

public class MainController implements Initializable {
	
	public static Session currentUser;
	
	@FXML
	private TextField loginField;
	@FXML
	private PasswordField passwordField;
	@FXML
	private Label loginAlert;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
	
	public void loginUser(ActionEvent e){
		try {
			currentUser = new Session(loginField.getText(), passwordField.getText());
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("../view/Vw_Menu.fxml"));
	        AnchorPane menu = (AnchorPane) loader.load();
	        Main.rootLayout.setCenter(menu);			
		} catch (Creation_Exception e1) {
			// TODO Auto-generated catch block
			loginAlert.setText(e1.getErrors().toString());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("erro IOEx");
		}
	}

}
