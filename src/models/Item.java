package models;

import java.time.LocalDate;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;


public class Item {

	private StringProperty fabricante;
	private StringProperty validade;
	private StringProperty descricao;
	private ObjectProperty<LocalDate> data_entrada;
	private StringProperty grupo;
	private IntegerProperty codigo;
	private DoubleProperty preco_unitario;
	
	public Item(String fabricante, String validade, int codigo, 
			String descricao, int dia, int mes, int ano, String grupo, double preco_unitario){
		
		this.codigo.set(codigo);
		this.data_entrada = new SimpleObjectProperty<LocalDate>(LocalDate.of(dia, mes, ano));
		this.descricao.set(descricao);
		this.fabricante.set(fabricante);
		this.validade.set(validade);
		this.grupo.set(grupo);
		this.preco_unitario.set(preco_unitario);
		
	}

	public StringProperty getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante.set(fabricante);
	}

	public StringProperty getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade.set(validade);
	}

	public StringProperty getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao.set(descricao);
	}

	public ObjectProperty<LocalDate> getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(ObjectProperty<LocalDate> data_entrada) {
		this.data_entrada = data_entrada;
	}

	public StringProperty getGrupo() {
		return grupo;
	}

	public void setGrupo(StringProperty grupo) {
		this.grupo = grupo;
	}

	public IntegerProperty getCodigo() {
		return codigo;
	}

	public void setCodigo(IntegerProperty codigo) {
		this.codigo = codigo;
	}

	public DoubleProperty getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(DoubleProperty preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	
		
	
	
}
