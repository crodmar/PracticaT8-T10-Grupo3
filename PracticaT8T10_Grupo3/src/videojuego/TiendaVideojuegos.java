package videojuego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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

	public void agregarVideojuego(Videojuego videoJuego) {

		inventario.add(videoJuego);

	}

	public void mostrarJuegosDisponibles() {

		System.out.println(inventario);

		}
	}


