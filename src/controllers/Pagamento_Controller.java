package controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.security.auth.callback.TextInputCallback;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import models.Item;

public class Pagamento_Controller implements Initializable{

	
	@FXML
	private Label lb_valorTotal;
	@FXML
	private MenuButton mb_tipoPagamento;
	@FXML
	private Label lb_valorTotalPagamento;
	@FXML
	private Label lb_valorPago;
	@FXML
	private Label lb_valorTroco;
	@FXML
	private DatePicker dp_dataHoje;
	@FXML
	private MenuItem mi_dinheiro;
	@FXML
	private TableView<Item> tv_tabelaItens;
	@FXML
	private TableColumn<Item, String> tc_descricao;
	@FXML
	private TableColumn<Item, String> tc_codigo;
	@FXML
	private TableColumn<Item, String> tc_preco;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		this.dp_dataHoje.setValue(LocalDate.now());
		this.lb_valorTotal.setText("" + MainController.currentUser.getCompra().getPreco_compra());
		List<Item> itens = MainController.currentUser.getCompra().getItens();
		this.tv_tabelaItens.setItems(FXCollections.observableArrayList(itens));
	}
	
	public void pagamentoDinheiro(ActionEvent e){
		
		TextInputDialog dialog =  new TextInputDialog(this.lb_valorTotal.getText());
		dialog.setHeaderText("Pagamento em Dinheiro");
		dialog.setTitle("Pagamento");
		dialog.setContentText("Digite o valor");
		
		Optional<String> result = dialog.showAndWait();
		this.lb_valorPago.setText(result.get());
		this.lb_valorTroco.setText("" + MainController.currentUser.getCompra().getPagamento().getTroco_total());
	}
	
	

}
