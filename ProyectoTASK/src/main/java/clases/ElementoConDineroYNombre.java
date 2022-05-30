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

	/**
	 * Devuelve el valor de nombre
	 * @return String devuelve el valor de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el valor de precio
	 * @return float devuelve el valor de precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * Método que da un nuevo valor a la variable nombre
	 * @param nombre el nuevo valor de nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que da un nuevo valor a la variable precio
	 * @param precio el nuevo valor de precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
}
