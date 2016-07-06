package models;

import java.util.ArrayList;

public class Compra_model {
	
	private ArrayList<Item_model> itens;
	private double preco_compra;
	private String data_compra;
	private String nome_user;
	
	public ArrayList<Item_model> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item_model> itens) {
		this.itens = itens;
	}
	public double getPreco_compra() {
		return preco_compra;
	}
	public void setPreco_compra(double preco_compra) {
		this.preco_compra = preco_compra;
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
