package design_patterns.state;

public class AtencaoException extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AtencaoException(String aviso) {
		super (aviso);
		System.out.println("Classe AtecaoException Chamada");
	}
}
