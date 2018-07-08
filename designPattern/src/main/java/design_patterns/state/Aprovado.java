package design_patterns.state;

public class Aprovado implements EstadosOrcamento {

	 public void calcularDesconto(Orcamento orcamento) {
		orcamento.desconto = orcamento.valor * 0.05;
		orcamento.valor -= orcamento.desconto;
	}

	public void aprovado(Orcamento orcamento) throws AtencaoException{
		throw new AtencaoException("Orçamento já está como aprovado");
	}

	public void reprovado(Orcamento orcamento)throws AtencaoException{
		throw new AtencaoException("Orçamento aprovado não pode ser reprovado ao cliente");
	}

	public void finalizado(Orcamento orcamento) {
		orcamento.estadoOrcamento = new Finalizado();
	}
	
	
	 
}
