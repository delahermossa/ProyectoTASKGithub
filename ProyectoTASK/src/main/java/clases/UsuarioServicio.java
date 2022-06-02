package clases;

public class UsuarioServicio {

	private Usuario usuario;
	private Servicio servicio;
	/**
	 * Creación de esta clase para poder listar servicios ya que tenemos una tabla intermedia en BD entre
	 * Usuarios y servicios y necesitamos recoger la informacion de ambas partes
	 * @param usuario
	 * @param servicio
	 */

	public UsuarioServicio(Usuario usuario, Servicio servicio) {
		super();
		this.usuario = usuario;
		this.servicio = servicio;
	}

	public UsuarioServicio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Devuelve el valor de usuario
	 * 
	 * @return Usuario devuelve el valor de usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Devuelve el valor de servicio
	 * 
	 * @return Servicio devuelve el valor de servicio
	 */
	public Servicio getServicio() {
		return servicio;
	}

	/**
	 * Método que da un nuevo valor a la variable usuario
	 * 
	 * @param usuario el nuevo valor de usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Método que da un nuevo valor a la variable servicio
	 * 
	 * @param servicio el nuevo valor de servicio
	 */
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	@Override
	public String toString() {
		return "UsuarioServicio [usuario=" + usuario + ", servicio=" + servicio + "]";
	}

}
