package clases;

import java.time.LocalDateTime;

public class Cita {
	
	
	private LocalDateTime fechaCita;
	private Usuario usuario;
	private Servicio servicio;


	public Cita(LocalDateTime fechaCita, Usuario usuario, Servicio servicio) {
		super();
		this.fechaCita = fechaCita;
		this.usuario = usuario;
		this.servicio = servicio;
	}
	
	public Cita() {
		super();
	}

	/**
	 * Devuelve el valor de fechaCita
	 * @return LocalDateTime devuelve el valor de fechaCita
	 */
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	/**
	 * Devuelve el valor de usuario
	 * @return Usuario devuelve el valor de usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Devuelve el valor de servicio
	 * @return Servicio devuelve el valor de servicio
	 */
	public Servicio getServicio() {
		return servicio;
	}

	/**
	 * Método que da un nuevo valor a la variable fechaCita
	 * @param fechaCita el nuevo valor de fechaCita
	 */
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	/**
	 * Método que da un nuevo valor a la variable usuario
	 * @param usuario el nuevo valor de usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Método que da un nuevo valor a la variable servicio
	 * @param servicio el nuevo valor de servicio
	 */
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	

}
