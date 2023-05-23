package videojuego;

import java.util.Set;
import java.util.TreeSet;

public class TiendaVideojuegos {

	private Set<Videojuego> inventario;
	
	public TiendaVideojuegos() {
		this.inventario = new TreeSet<>();
	}

	public Set<Videojuego> getInventario() {
		return inventario;
	}

	public void setInventario(Set<Videojuego> inventario) {
		this.inventario = inventario;
	}
	
	
	   
}

