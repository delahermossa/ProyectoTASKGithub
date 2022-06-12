package excepciones;

public class UsuarioNoExisteException extends Exception{
	public UsuarioNoExisteException(String m) {
		/**
		 * Excepcion el usuario no existe
		 */
		super(m);
	}
}
