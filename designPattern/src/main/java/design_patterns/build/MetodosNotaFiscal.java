package design_patterns.build;

public interface MetodosNotaFiscal {
	geradorNotaFiscal razaoSocial(String razaoSocial);
	geradorNotaFiscal cnpj (long cnpj);
	geradorNotaFiscal item(ItemNota itemNota);
	geradorNotaFiscal observacao (String obsercacao);
	setNotaFiscal criadoNota();
}
