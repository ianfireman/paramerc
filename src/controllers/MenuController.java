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
	
	private Parent parent;
	private Stage stage;
	private Scene scene;
	
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
		stage = new Stage();
		configStage();
		usernameMenu.setText(MainController.currentUser.getUser().getUsername());
			startCaixa();
	}	
	
	public void startCaixa() throws IOException {
		if(!checkModule("Caixa")){ // se o modulo nao for Caixa entao ele abre o Caixa
			parent = FXMLLoader.load(getClass().getResource("../view/AP_CaixaCompra.fxml"));
			scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Caixa");
			stage.setResizable(false);
			stage.show();
		}
	}

	public void startEstoque() throws IOException{
		if(!checkModule("Estoque")){ // se o modulo nao for estoque entao ele abre o estoque
			parent = FXMLLoader.load(getClass().getResource("../view/AP_CaixaCompra.fxml"));
			scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("Estoque");
			stage.show();	
		}
	}
	
	public void startFinanceiro() throws IOException{
		if(!checkModule("Financeiro")){ // se o modulo nao for Financeiro entao ele abre o Financeiro
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

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
	
	
}
