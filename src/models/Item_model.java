package models;

public class Item_model {

	private String fabricante;
	private String validade;
	private String descricao;
	private String data_entrada;
	private String grupo;
	private int codigo;
	private double preco_unitario;
	
	public Item_model(String fabricante, String validade, int codigo, 
			String descricao, String data_entrada, String grupo, double preco_unitario){
		
		this.codigo = codigo;
		this.data_entrada = data_entrada;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.validade = validade;
		this.grupo = grupo;
		this.preco_unitario = preco_unitario;
		
	}
	
	public double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
