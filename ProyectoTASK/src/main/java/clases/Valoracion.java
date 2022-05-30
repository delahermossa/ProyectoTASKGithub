package clases;

public class Valoracion {
	
	private byte estrellas;
	private String comentario;
	private Usuario usuario;
	
	
	public Valoracion(byte estrellas, String comentario, Usuario usuario) {
		super();
		this.estrellas = estrellas;
		this.comentario = comentario;
		this.usuario = usuario;
	}


	public Valoracion() {
		super();
	}


	/**
	 * Devuelve el valor de estrellas
	 * @return byte devuelve el valor de estrellas
	 */
	public byte getEstrellas() {
		return estrellas;
	}


	/**
	 * Devuelve el valor de comentario
	 * @return String devuelve el valor de comentario
	 */
	public String getComentario() {
		return comentario;
	}


	/**
	 * Devuelve el valor de usuario
	 * @return Usuario devuelve el valor de usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}


	/**
	 * Método que da un nuevo valor a la variable estrellas
	 * @param estrellas el nuevo valor de estrellas
	 */
	public void setEstrellas(byte estrellas) {
		this.estrellas = estrellas;
	}


	/**
	 * Método que da un nuevo valor a la variable comentario
	 * @param comentario el nuevo valor de comentario
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	/**
	 * Método que da un nuevo valor a la variable usuario
	 * @param usuario el nuevo valor de usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
