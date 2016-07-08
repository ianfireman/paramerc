package models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import exceptions.Item_Exception;
import exceptions.Validade_Exception;

public class Compra {
	
	private ArrayList<Item> itens;
	private double preco_compra = 0;
	private String data_compra;
	private String nome_user;
	private Pagamento pagamento;
	
	public Pagamento getPagamento(){
		return pagamento;
	}
	public Compra(){
		itens = new ArrayList<Item>();
		this.pagamento = new Pagamento();
	}
	
	public void addItem(Item novoItem) throws Item_Exception, Validade_Exception, ParseException{		
		if (novoItem == null){
			throw new Item_Exception();
		}
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date today = new Date();
		Date itemDate = (Date)formatter.parse(novoItem.getValidade());
		
		if(today.after(itemDate)){
			throw new Validade_Exception();
		} else {
			itens.add(novoItem);
		}
	}
	public int getTotalItens(){
		return itens.size();
	}
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	public double getPreco_compra() {
		return preco_compra;
	}
	public void setPreco_compra(double preco_compra) {
		this.preco_compra = this.preco_compra + preco_compra;
	}
	public String getData_compra() {
		return data_compra;
	}
	public void setData_compra(String data_compra) {
		this.data_compra = data_compra;
	}
	public String getNome_user() {
		return nome_user;
	}
	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}
	
	

}
