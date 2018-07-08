package design_patterns.build;

import java.util.ArrayList;

public class NotaFiscal {
	
	private String razaoSocial;
	private long cnpj;
	private double valorImposto;
	private double valorNota;
	private String observacao;
	private ArrayList<ItemNota> itens;

	public NotaFiscal (String razaoSocial,
						double valorNota,
						double valorImposto,
						String obsercacao, long cnpj, ArrayList<ItemNota> itens) {
		
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
