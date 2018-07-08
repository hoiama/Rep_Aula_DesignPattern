package design_patterns.build;

public interface MetodosNotaFiscal {

	GeradoNotaFiscal razaoSocial(String razaoSocial);
	GeradoNotaFiscal cnpj (long cnpj);
	GeradoNotaFiscal item(ItemNota itemNota);
	GeradoNotaFiscal observacao (String obsercacao);
	public NotaFiscal criadoNota();
}
