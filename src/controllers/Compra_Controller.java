package controllers;

import java.net.URL;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Compra;
import models.Item;
import models.LoadItens;


public class Compra_Controller implements Initializable{

	private Item item;
	private LoadItens li = new LoadItens();
	private DecimalFormat df;
	
	private Stage stage;
	private Parent parent;
	private Scene scene;
	
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
	@FXML
	private Button btn_confirmar;
	@FXML
	private SplitPane sp_telaCompra;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.dp_dataHoje.setValue(LocalDate.now());
		li.loadItemList();
		df = new DecimalFormat("#.00");
	}
	
	public void AdicionarItem(ActionEvent e){
		//Item item = ConectaBanco.procuraItem(tf_codigoBarras);
		item = li.getItemByCodigo(Integer.parseInt(tf_codigoBarras.getText()));
		MainController.currentUser.getCompra().addItem(item);
		MainController.currentUser.getCompra().setPreco_compra(item.getPreco_unitario());
		this.lb_valorTotal.setText("R$ " + df.format(MainController.currentUser.getCompra().getPreco_compra()));
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
	public void disableTela(ActionEvent e){
		this.sp_telaCompra.setDisable(true);
	}

}
