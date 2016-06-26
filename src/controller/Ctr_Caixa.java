package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class Ctr_Caixa implements Initializable{

	@FXML
	private AnchorPane Ap_PrincipalBottom;
	@FXML
	private AnchorPane Ap_DefaultButtons;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void addPane(ActionEvent event){
		
		Ap_PrincipalBottom.getChildren().add(Ap_DefaultButtons);
		
	}
	
	
	

}
