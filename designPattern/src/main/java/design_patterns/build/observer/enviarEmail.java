package design_patterns.build.observer;

public class enviarEmail implements TipoEnviosNota{

	public void executa(NotaFiscal notaFiscal) {
	System.out.println("Enviando nota por Email");
		
	}

}
