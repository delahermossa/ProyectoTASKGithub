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

}
