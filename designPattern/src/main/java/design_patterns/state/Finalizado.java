package design_patterns.state;

public class Finalizado implements EstadosOrcamento{

	public void calcularDesconto(Orcamento orcamento) {
		orcamento.desconto = 0;
		orcamento.valor -= orcamento.desconto;	
	}

	public void aprovado(Orcamento orcamento) throws AtencaoException {
		throw new AtencaoException("Orçamento já foi finalizado");
	}

	public void reprovado(Orcamento orcamento) throws AtencaoException{
		throw new AtencaoException("Orçamento já foi finalizado");
	}

	public void finalizado(Orcamento orcamento) throws AtencaoException {
		throw new AtencaoException("Orçamento já está como Finalizado");
	}
}
