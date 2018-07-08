package design_patterns.build.observer;

public class Build_observer {

	
	public static void main(String[] args) {
		
		ItemNota cadeira = new ItemNota();
		cadeira.setImposto(20);
		cadeira.setValorItemm(100);
		
		ItemNota mesa = new ItemNota();
		mesa.setImposto(10);
		mesa.setValorItemm(200);
		
		GeradoNotaFiscal geradorNota = new GeradoNotaFiscal()
		.razaoSocial("razão minha empresa")
		.cnpj(234543543)
		.item(cadeira)
		.item(mesa)
		.observacao("Obsercação hoiama")
		.tipoEnvioEscolhido(new enviarEmail())
		.tipoEnvioEscolhido(new enviarFax());
		
		
		NotaFiscal nota = geradorNota.criadoNota();
		
		
		System.out.println(" CNPJ: " + nota.getCnpj() + 
							" Observação: " + nota.getObservacao() +
							" Razão Social: " + nota.getRazaoSocial() +
							" Valor da nota: " + nota.getValorNota());
		
		
		
	}
}
