package videojuego;

import java.util.LinkedList;
import java.util.List;

public class Cliente implements Comparable{

	private String nombre;
	private String direccion;	
	private List<Videojuego> videojuegosComprados; 
	
	
	public Cliente() {
		this.nombre = "generico";
		this.direccion = "generico";
		this.videojuegosComprados = new LinkedList<>();
	}
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.videojuegosComprados = new LinkedList<>();
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Videojuego> getVideojuegosComprados() {
		return videojuegosComprados;
	}
	
	public void setVideojuegosComprados(Videojuego videojuego) {
		this.videojuegosComprados.add(videojuego);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", videojuegosComprados="
				+ videojuegosComprados + "]";
	}
	
	
	@Override
    public boolean equals(Object obj) {
        Cliente otro = (Cliente) obj;
        return this.getNombre().equalsIgnoreCase(otro.getNombre())
                && this.getDireccion().equalsIgnoreCase(otro.getDireccion()) 
                && this.getVideojuegosComprados().equals(otro.getVideojuegosComprados());
    }

	
	@Override
	public int compareTo(Object arg0) {
		Cliente otro = (Cliente) arg0;		
		return this.getNombre().compareTo(otro.getNombre());
	}
	
	
	
}
