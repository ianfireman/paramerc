package controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Compra;
import models.Item;
import models.LoadItens;


public class Compra_Controller implements Initializable{

	private Compra compra;
	private Item item;
	private LoadItens li = new LoadItens();
	
	@FXML
	private Label lb_qtdItens;
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
		li.loadItemList();
	}
	
//	private Item mockItem(){
//		
//		Item item = new Item("Nestle", dp_dataHoje.getValue().toString(),12,"Nescal", 
//				"23/01/2016" ,"Alimentos",10.00);
//		return item;
//	}
//	
//	private void mockCompra(){
//		compra = new Compra();
//		compra.setData_compra("06/07/2016");
//		compra.setNome_user("Abhner");
//	}
	
	public void AdicionarItem(ActionEvent e){
		//Item item = ConectaBanco.procuraItem(tf_codigoBarras);
//		Item item = mockItem();
//		mockCompra();
		item = li.getItemByCodigo(Integer.parseInt(tf_codigoBarras.getText()));
		MainController.currentUser.getCompra().addItem(item);
		MainController.currentUser.getCompra().setPreco_compra(item.getPreco_unitario());
		this.lb_valorTotal.setText("" + MainController.currentUser.getCompra().getPreco_compra());
		this.lb_codigoItem.setText("" + item.getCodigo());
		this.lb_descricaoItem.setText(item.getDescricao() + " " + item.getModelo());
		this.lb_precoItem.setText("" + item.getPreco_unitario());
		this.lb_qtdItens.setText("" + MainController.currentUser.getCompra().getTotalItens());
		this.tf_codigoBarras.setText("");
		this.tf_codigoBarras.requestFocus();
	}

	public void limparCodigoBarras(ActionEvent e){
		this.tf_codigoBarras.clear();
	}

}
