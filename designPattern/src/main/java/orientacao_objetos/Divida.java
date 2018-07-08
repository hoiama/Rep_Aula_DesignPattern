package orientacao_objetos;

import java.util.ArrayList;

public class Divida {

	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	private ArrayList<Pagamento> listaPagamentos = new ArrayList<Pagamento>();
	
	
	public void registrarPagamento(Pagamento pagamento) {
		this.listaPagamentos.add(pagamento);
		this.efetuarPagamento(pagamento.getValor());
	}
	
	
	private void efetuarPagamento(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("valor menor que zero");
		}
		
		if (valor > 100) {
			valor -= 8;
		}
		this.valorPago += valor;
	}

	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return valorPago;
	}

//	public void setValorPago(double valorPago) {
//		this.valorPago = valorPago;
//	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public ArrayList<Pagamento> getListaPagamentos() {
		return listaPagamentos;
	}

	
}
