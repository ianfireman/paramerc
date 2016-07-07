package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import exceptions.Creation_Exception;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Compra;
import models.Session;
import models.User;

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
	}
	
	public void loginUser(ActionEvent e){
		try {
			User user = new User(loginField.getText(), passwordField.getText(), 1);
			Compra compra = new Compra();
			currentUser = new Session(user, compra);
			startMenu(e);
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Creation_Exception e2) {
			loginAlert.setText(e2.getErrors().toString());
		}
	}

	private void startMenu(ActionEvent e) throws IOException {
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("../view/AP_Menu_Modulos.fxml"));
        AnchorPane menu = (AnchorPane) loader.load();
        //Main.rootLayout.setCenter(menu);
        Main.rootLayout.getChildren().add(menu);
        Main.rootLayout.setTopAnchor(menu, 0.0);
        Main.rootLayout.setBottomAnchor(menu, 0.0);
        Main.rootLayout.setRightAnchor(menu, 0.0);
        Main.rootLayout.setLeftAnchor(menu, 0.0);
	}
	
	public void closeApplication(ActionEvent e){
		Platform.exit();
	}
}
