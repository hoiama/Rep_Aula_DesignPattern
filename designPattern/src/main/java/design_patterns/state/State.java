package design_patterns.state;

public class State {

	public static void main (String[] args) {
		
		//estadoOrcamento : EmAndamento
		Orcamento orcamentoObra = new Orcamento(10000); 	
		
		orcamentoObra.calcularDesconto(); 					
		System.out.println("Desconto: " +  orcamentoObra.desconto);
		System.out.println("Orcaçemto com Desconto Atual: "  + orcamentoObra.valor);
		System.out.println("Estado atual: " +  orcamentoObra.estadoOrcamento.getClass().getSimpleName() + "\n");
		
		orcamentoObra.calcularDesconto(); 					
		System.out.println("Desconto: " +  orcamentoObra.desconto);
		System.out.println("Orcaçemto com Desconto Atual: "  + orcamentoObra.valor);
		System.out.println("Estado atual: " +  orcamentoObra.estadoOrcamento.getClass().getSimpleName() + "\n");

		//estadoOrcamento : Aprovado
		orcamentoObra.aprovado();
		orcamentoObra.calcularDesconto();
		System.out.println("Desconto: " +  orcamentoObra.desconto);
		System.out.println("Orcaçemto com Desconto Atual : "  + orcamentoObra.valor );
		System.out.println("Estado atual: " +  orcamentoObra.estadoOrcamento.getClass().getSimpleName() + "\n");
		
		
		orcamentoObra.finalizado();
		orcamentoObra.calcularDesconto();
		System.out.println("Desconto: " +  orcamentoObra.desconto);
		System.out.println("Orcaçemto com Desconto Atual : "  + orcamentoObra.valor );
		System.out.println("Estado atual: " +  orcamentoObra.estadoOrcamento.getClass().getSimpleName() + "\n");
		
		
		orcamentoObra.reprovado();
		orcamentoObra.calcularDesconto();
		System.out.println("Desconto: " +  orcamentoObra.desconto);
		System.out.println("Orcaçemto com Desconto Atual : "  + orcamentoObra.valor );
		System.out.println("Estado atual: " +  orcamentoObra.estadoOrcamento.getClass().getSimpleName() + "\n");
	
	}
}
