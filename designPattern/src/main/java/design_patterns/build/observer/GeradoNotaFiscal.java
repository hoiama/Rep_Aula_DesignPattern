package design_patterns.build.observer;

import java.util.ArrayList;

public class GeradoNotaFiscal implements MetodosNotaFiscal{

	private String razaoSocial;
	private long cnpj;
	private double valorImposto;
	private double valorNota;
	private String observacao;
	private ArrayList<ItemNota> Itens = new ArrayList<ItemNota>();
	private ArrayList<TipoEnviosNota> tiposEnvio;
	
	public GeradoNotaFiscal(){
		this.tiposEnvio = new ArrayList<TipoEnviosNota>();
	}

	/**
	 * Adicionar os tipos de envios
	 * @param tipoEnvio
	 * @return
	 */
	public GeradoNotaFiscal tipoEnvioEscolhido (TipoEnviosNota tipoEnvio) {	
		this.tiposEnvio.add(tipoEnvio);
		return this;
	}
	
	public GeradoNotaFiscal razaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public GeradoNotaFiscal cnpj(long cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public GeradoNotaFiscal item(ItemNota itemNota) {
		this.valorNota += itemNota.getValorItemm();
		this.valorImposto += itemNota.getImposto();
		this.Itens.add(itemNota);
		return this;
	}

	public GeradoNotaFiscal observacao(String obsercacao) {
		this.observacao = obsercacao;
		return this;
	}
	
	public NotaFiscal criadoNota() {
		 NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, valorNota, valorImposto, observacao, cnpj, Itens);
		 
		 
		for (TipoEnviosNota envios : tiposEnvio) {
			envios.executa(notaFiscal);
		}
		
		return notaFiscal;
	}

}
