package orientacao_objetos;

import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap <String, Divida> hashMapDividas = new HashMap<String , Divida>();
	
	
	public void registrarDivida (String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		divida.setTotal(valor);
		hashMapDividas.put(cnpjCredor , divida);
	}
	
	public void valorPago(String cnpjCredor, double valor, String cnpjPagador, String nomePagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setNomePagador(nomePagador);
		pagamento.setValor(valor);
		
		Divida divida = hashMapDividas.get(cnpjCredor);
		
		divida.registrarPagamento(pagamento);
		
	}
	
}
