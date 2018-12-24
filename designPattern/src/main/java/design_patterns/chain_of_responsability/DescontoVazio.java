package design_patterns.chain_of_responsability;

public class DescontoVazio implements Desconto{

	public Double desconto(double valor) {
		return 0.0;
	}

	public void setProximoDescontoClass(Desconto proximoDescontoClass) {
	}
}
