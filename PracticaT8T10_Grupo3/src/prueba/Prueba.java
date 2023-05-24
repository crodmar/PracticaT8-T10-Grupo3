package prueba;

import java.util.LinkedList;
import java.util.List;

import videojuego.Cliente;
import videojuego.JuegoDigital;
import videojuego.JuegoFisico;
import videojuego.TiendaVideojuegos;
import videojuego.Videojuego;

public class Prueba {

	public static void main(String[] args) {
		
		JuegoDigital juegoDigital1 = new JuegoDigital("GTA V", "Acción", "PC", 20.00, 50);
		JuegoDigital juegoDigital2 = new JuegoDigital("Minecraft", "Sandbox", "PC", 19.95, 20);
		JuegoFisico juegoFisico1 = new JuegoFisico("God of War", "Aventura", "PS4", 20.00, "NUEVO", "en_stock");
		JuegoFisico juegoFisico2 = new JuegoFisico("Tekken", "Lucha", "PS2", 5.00, "USADO", "agotado");
		
		Cliente cliente1 = new Cliente("Pepe", "Calle Blasco Ibáñez, 1");
		Cliente cliente2 = new Cliente("María", "Calle Kansas City, 2");
		
		TiendaVideojuegos tienda1 = new TiendaVideojuegos();
		TiendaVideojuegos tienda2 = new TiendaVideojuegos();
		
		tienda1.agregarVideojuego(juegoFisico2);
		tienda2.agregarVideojuego(juegoDigital2);
		tienda1.agregarVideojuego(juegoDigital1);
		tienda2.agregarVideojuego(juegoFisico1);
		
		tienda2.buscarJuegosPorGenero("Sandbox");
		tienda1.buscarJuegosPorGenero("Sandbox");
		
		tienda2.buscarJuegosPorPlataforma("PC");
		tienda1.buscarJuegosPorPlataforma("PS1");
		
		tienda1.mostrarJuegosDisponibles();
		tienda2.mostrarJuegosDisponibles();
		
		tienda1.venderJuego(cliente2, juegoFisico2);
		tienda2.venderJuego(cliente1, juegoDigital2);
		tienda2.venderJuego(cliente1, juegoFisico2);
		
	}
}
