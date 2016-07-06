package models;

public class Pagamento_model {
	
	private int tipo_pagamento;
	private String data_pagamento;
	private String nome_user;
	private Compra_model compra;
	private double pago_total;
	private double troco_total;
	
	public int getTipo_pagamento() {
		return tipo_pagamento;
	}
	public void setTipo_pagamento(int tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}
	public String getData_pagamento() {
		return data_pagamento;
	}
	public void setData_pagamento(String data_pagamento) {
		this.data_pagamento = data_pagamento;
	}
	public String getNome_user() {
		return nome_user;
	}
	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}
	public Compra_model getCompra() {
		return compra;
	}
	public void setCompra(Compra_model compra) {
		this.compra = compra;
	}
	public double getPago_total() {
		return pago_total;
	}
	public void setPago_total(double pago_total) {
		this.pago_total = pago_total;
	}
	public double getTroco_total() {
		return troco_total;
	}
	public void setTroco_total(double troco_total) {
		this.troco_total = troco_total;
	}

}
