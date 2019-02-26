package design_patterns.build;

import java.util.ArrayList;

public class setNotaFiscal {
	
	private String razaoSocial, observacao;
	private long cnpj;
	private double valorImposto, valorNota;
	private ArrayList<ItemNota> itens;

	public setNotaFiscal(String razaoSocial, double valorNota, double valorImposto, String obsercacao, long cnpj, ArrayList<ItemNota> itens) {
		this.razaoSocial = razaoSocial;
		this.valorNota = valorNota;
		this.valorImposto = valorImposto;
		this.observacao = obsercacao;
		this.cnpj = cnpj;
		this.itens = itens;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public long getCnpj() {
		return cnpj;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public double getValorNota() {
		return valorNota;
	}

	public String getObservacao() {
		return observacao;
	}

	public ArrayList<ItemNota> getItens() {
		return itens;
	}

}
