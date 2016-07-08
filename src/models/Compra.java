package models;

import java.util.ArrayList;

import exceptions.Item_Exception;

public class Compra {
	
	private ArrayList<Item> itens;
	private double preco_compra = 0;
	private String data_compra;
	private String nome_user;
	
	
	public Compra(){
		itens = new ArrayList<Item>();
	}
	
	public void addItem(Item novoItem) throws Item_Exception{
		if(novoItem != null){
			itens.add(novoItem);
		} else {
			throw new Item_Exception();
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
