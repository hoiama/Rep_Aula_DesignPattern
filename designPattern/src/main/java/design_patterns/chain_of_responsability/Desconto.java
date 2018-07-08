package design_patterns.chain_of_responsability;

public interface Desconto {

	Double desconto (double valor);
	void setProximoDescontoClass(Desconto proximoDescontoClass);
}
