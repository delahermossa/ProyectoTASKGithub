package excepciones;

public class ContrasegnaIncorrectaException extends Exception{
	/**
	 * Excepcion contrase�a incorrecta
	 * @param m
	 */
	public ContrasegnaIncorrectaException(String m) {
		super(m);
	}
}
