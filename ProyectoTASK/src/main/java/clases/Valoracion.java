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
	
	

}
