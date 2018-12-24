package design_patterns.state;

public class Reprovado implements EstadosOrcamento{

	public void calcularDesconto(Orcamento orcamento) {
		orcamento.desconto = 0;
		orcamento.valor -= orcamento.desconto;
	}

	public void aprovado(Orcamento orcamento) throws AtencaoException{
		throw new AtencaoException("Orçamento não pode ser Aprovado depois de ter sido reprovado");
	}

	public void reprovado(Orcamento orcamento) throws AtencaoException{
		throw new AtencaoException("Orçamento já está como Reprovado");
	}

	public void finalizado(Orcamento orcamento) {
		orcamento.estadoOrcamento = new Finalizado();
	}
}
