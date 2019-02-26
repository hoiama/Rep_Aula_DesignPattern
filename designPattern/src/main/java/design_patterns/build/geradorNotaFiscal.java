package design_patterns.build;

import java.util.ArrayList;

public class geradorNotaFiscal implements MetodosNotaFiscal{

	private String razaoSocial;
	private long cnpj;
	private double valorImposto;
	private double valorNota;
	private String observacao;
	private ArrayList<ItemNota> Itens = new ArrayList<ItemNota>();

	public geradorNotaFiscal razaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public geradorNotaFiscal cnpj(long cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public geradorNotaFiscal item(ItemNota itemNota) {
		this.valorNota += itemNota.getValorItemm();
		this.valorImposto += itemNota.getImposto();
		this.Itens.add(itemNota);
		return this;
	}

	public geradorNotaFiscal observacao(String obsercacao) {
		this.observacao = obsercacao;
		return this;
	}
	
	public setNotaFiscal criadoNota() {
		return new setNotaFiscal(razaoSocial, valorNota, valorImposto, observacao, cnpj, Itens);
	}
}
