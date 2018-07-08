package design_patterns.state;

public class EmAndamento implements EstadosOrcamento{

	private int contador = 0;
	
	public void calcularDesconto(Orcamento orcamento) throws AtencaoException {
		if(contador == 0) {
			orcamento.desconto = orcamento.valor * 0.10;
			orcamento.valor -= orcamento.desconto; 
			contador ++;
		} else {
			throw new AtencaoException("Desconto já foi iaplicado");
		}
	}
	
	public void aprovado(Orcamento orcamento) {
		orcamento.estadoOrcamento =  new Aprovado();
	}

	public void reprovado(Orcamento orcamento) {
		orcamento.estadoOrcamento = new Reprovado();
	}

	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException ("Orçamento antes precisa ser aprovado ou reprovado ");
	}

}
