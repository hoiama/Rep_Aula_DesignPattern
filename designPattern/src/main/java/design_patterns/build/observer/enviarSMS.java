package design_patterns.build.observer;

public class enviarSMS implements TipoEnviosNota{
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando nota por SMS");
	}
}
