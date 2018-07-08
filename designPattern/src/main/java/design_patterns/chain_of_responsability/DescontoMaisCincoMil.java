package design_patterns.chain_of_responsability;

public class DescontoMaisCincoMil implements Desconto{

	Desconto proximoDescontoClass;
	
	public Double desconto(double valor) {
		if(valor > 5000 ) {
			double desconto = valor * 0.02;
			return desconto;
		}else {
			return proximoDescontoClass.desconto(valor);
		}
	}

	public void setProximoDescontoClass(Desconto proximoDescontoClass) {
		this.proximoDescontoClass = proximoDescontoClass;
		}

	
}
