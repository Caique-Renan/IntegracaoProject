package Exceptions;

public class Exceptions extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Exceptions(String mensagem) {
		super(mensagem);
	}
	
	public Exceptions(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
