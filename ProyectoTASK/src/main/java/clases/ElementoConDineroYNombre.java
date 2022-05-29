package clases;

public abstract class ElementoConDineroYNombre {
	
	private String nombre;
	private float precio;
	
	public ElementoConDineroYNombre(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public ElementoConDineroYNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	public ElementoConDineroYNombre(float precio) {
		super();
		this.precio = precio;
	}

	public ElementoConDineroYNombre() {
		super();
	}
	
	
	
	
}
