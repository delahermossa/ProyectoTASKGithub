package excepciones;

public class ContrasegnaIncorrectaException extends Exception{
	/**
	 * Excepcion contraseña incorrecta
	 * @param m
	 */
	public ContrasegnaIncorrectaException(String m) {
		super(m);
	}
}
