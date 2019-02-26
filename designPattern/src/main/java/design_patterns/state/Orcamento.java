package design_patterns.state;

public class Orcamento {

	public double valor, desconto;
	public EstadosOrcamento estadoOrcamento;

	public Orcamento(int valor) {
		this.valor = valor;
		estadoOrcamento = new EmAndamento();
	}

	public void calcularDesconto() {
		try {
			estadoOrcamento.calcularDesconto(this);

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void aprovado() {
		try {
			estadoOrcamento.aprovado(this);

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void reprovado() {
		try {
			estadoOrcamento.reprovado(this);

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void finalizado() {
		try {
			estadoOrcamento.finalizado(this);

		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}
