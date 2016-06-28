package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MenuController implements Initializable {
	
	public Parent parent;
	public Stage stage;
	public Scene scene;
	
	@FXML
	private Label usernameMenu;
	@FXML
	private Button btn_caixa;
	@FXML
	private Button btn_financeiro;
	@FXML
	private Button btn_estoque;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		try {
			stage = new Stage();
			configStage();
//			//usernameMenu.setText(MainController.currentUser.getUsername());
//			startCaixa();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}	
	
	public void startCaixa() throws IOException {
		if(!checkModule("Caixa")){ // se o modulo nao for Caixa entao ele abre o Caixa
			stage.hide();
			parent = FXMLLoader.load(getClass().getResource("../view/AP_CaixaCompra.fxml"));
			scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Caixa");
			stage.setResizable(false);
			stage.setResizable(false);
			stage.show();
		}
	}

	public void startEstoque() throws IOException{
		if(!checkModule("Estoque")){ // se o modulo nao for estoque entao ele abre o estoque
			stage.hide();
			parent = FXMLLoader.load(getClass().getResource("../view/AP_CaixaCompra.fxml"));
			scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Estoque");
			stage.show();	
		}
	}
	
	public void startFinanceiro() throws IOException{
		if(!checkModule("Financeiro")){ // se o modulo nao for Financeiro entao ele abre o Financeiro
			stage.hide();
			parent = FXMLLoader.load(getClass().getResource("../view/AP_CaixaCompra.fxml"));
			scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Financeiro");
			stage.setResizable(false);
			stage.show();	
		}
	}
	
	private boolean checkModule(String title) {
		if(scene == null){
			return false;
		} else if(stage.getTitle().equals(title)){
			return true;
		}
		return false;
	}
	
	private void configStage(){
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
		stage.setX(primScreenBounds.getWidth()*0.21); 
		stage.setY(primScreenBounds.getHeight()*0.005);
		stage.setWidth(primScreenBounds.getWidth()*0.79);
		stage.setHeight(primScreenBounds.getHeight()*0.99);
	}
	
	public void logoutUser(ActionEvent e){
		MainController.currentUser = null;
		stage.hide();
		Main.showLoginMenu();
	}
}
