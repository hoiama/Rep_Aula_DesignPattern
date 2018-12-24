package design_patterns.state;

public interface EstadosOrcamento {
	
	void calcularDesconto(Orcamento orcamento) throws AtencaoException;
	public void aprovado(Orcamento orcamento) throws AtencaoException;
	public void reprovado(Orcamento orcamento) throws AtencaoException;
	public void finalizado (Orcamento orcamento) throws AtencaoException;
}
