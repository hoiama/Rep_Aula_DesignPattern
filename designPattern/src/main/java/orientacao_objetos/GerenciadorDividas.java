package orientacao_objetos;

public class GerenciadorDividas {

	public void efetuarPagamento(Divida divida, double valor, String nomePagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setNomePagador(nomePagador);
		pagamento.setValor(valor);
		
		divida.registrarPagamento(pagamento);
		
	}
}
