package videojuego;

import java.util.ArrayList;
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

		System.out.println("Juegos disponibles en la tienda:");
		for (Videojuego juego : inventario) {
			System.out.println(juego.getTitulo());

		}
	}

	public void buscarJuegosPorGenero(String genero) {
		String resultado="";
		List<Videojuego> juegosPorGenero = new ArrayList<>();
		for (Videojuego juego : inventario) {
			if (juego.getGenero().equalsIgnoreCase(genero)) {
				juegosPorGenero.add(juego);
				resultado="Se ha encontrado: "+juego;
			}
			else {
				resultado="No se ha encontrado juego de ese género.";
			}
		}
		
		System.out.println(resultado);
		
	}

	public void buscarJuegosPorPlataforma(String plataforma) {
		String resultado="";
		List<Videojuego> juegosPorPlataforma = new ArrayList<>();
		for (Videojuego juego : inventario) {
			if (juego.getPlataforma().equalsIgnoreCase(plataforma)) {
				juegosPorPlataforma.add(juego);
			resultado="Se ha encontrado: "+juego;
		}
		else {
			resultado="No se ha encontrado juego de esa plataforma.";
		}
	}
	
	System.out.println(resultado);
}

	public Videojuego obtenerJuegoMasCaro() {
		Videojuego juegoMasCaro = null;
		double precioMaximo = Double.MIN_VALUE;
		for (Videojuego juego : inventario) {
			if (juego.getPrecio() > precioMaximo) {
				precioMaximo = juego.getPrecio();
				juegoMasCaro = juego;
			}
		}
		return juegoMasCaro;
	}

	public Videojuego obtenerJuegoMasBarato() {
		Videojuego juegoMasBarato = null;
		double precioMinimo = Double.MAX_VALUE;
		for (Videojuego juego : inventario) {
			if (juego.getPrecio() < precioMinimo) {
				precioMinimo = juego.getPrecio();
				juegoMasBarato = juego;
			}
		}
		return juegoMasBarato;
	}

	public void venderJuego(Cliente cliente, Videojuego juego) {
		if (inventario.contains(juego)) {
			inventario.remove(juego);
			cliente.getVideojuegosComprados();
			System.out.println(
					"El juego " + juego.getTitulo() + " ha sido vendido al cliente " + cliente.getNombre() + ".");
		} else {
			System.out.println("El juego " + juego.getTitulo() + " no está disponible en la tienda.");
		}
	}

}
