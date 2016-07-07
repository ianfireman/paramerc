package controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Compra_model;
import models.Item_model;


public class Compra_Controller implements Initializable{

	private Compra_model compra;
	private Item_model item;
	
	@FXML
	private Label lb_valorTotal;
	@FXML
	private TextField tf_codigoBarras;
	@FXML
	private Button btn_ok;
	@FXML
	private Button btn_limpar;
	@FXML
	private Label lb_codigoItem;
	@FXML
	private Label lb_descricaoItem;
	@FXML
	private Label lb_precoItem;
	@FXML
	private DatePicker dp_dataHoje;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.dp_dataHoje.setValue(LocalDate.now());
	}
	
	private Item_model mockItem(){
		Item_model item = new Item_model("Nestle","23/08/2016",12,"Nescal","23/01/2016","Alimentos",10.00);
		return item;
	}
	
	private void mockCompra(){
		compra = new Compra_model();
		compra.setData_compra("06/07/2016");
		compra.setNome_user("Abhner");
	}
	
	public void AdicionarItem(ActionEvent e){
		//Item item = ConectaBanco.procuraItem(tf_codigoBarras);
		Item_model item = mockItem();
		mockCompra();
		MainController.currentUser.getCompra().addItem(item);
		MainController.currentUser.getCompra().setPreco_compra(item.getPreco_unitario());
		this.lb_valorTotal.setText("" + MainController.currentUser.getCompra().getPreco_compra());
		this.lb_codigoItem.setText("" + item.getCodigo());
		this.lb_descricaoItem.setText(item.getDescricao());
		this.lb_precoItem.setText("" + item.getPreco_unitario());
	}

	public void limparCodigoBarras(ActionEvent e){
		this.tf_codigoBarras.clear();
	}

}
