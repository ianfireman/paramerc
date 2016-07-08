package models;

import java.time.LocalDate;


public class Item {

	private String fabricante;
	private String validade;
	private String descricao;
	private String data_entrada;
	private String grupo;
	private int codigo;
	private double preco_unitario;
	private String modelo;
	
	public Item(String fabricante, String validade, int codigo, 
			String descricao, String data_entrada , String grupo, double preco_unitario, String modelo){
		
		this.codigo =codigo;
		this.data_entrada = data_entrada;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.validade = validade;
		this.grupo = grupo;
		this.preco_unitario = preco_unitario;
		this.modelo = modelo;
		
	}
	
	
	public String getModelo() {
		return modelo;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public String getValidade() {
		return validade;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getData_entrada() {
		return data_entrada;
	}

	public String getGrupo() {
		return grupo;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPreco_unitario() {
		return preco_unitario;
	}
	
	
	
}
