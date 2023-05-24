package prueba;

import java.util.LinkedList;
import java.util.List;

import videojuego.Cliente;
import videojuego.JuegoDigital;
import videojuego.JuegoFisico;
import videojuego.Videojuego;

public class Prueba {

	public static void main(String[] args) {
		
		JuegoDigital juegoDigital1 = new JuegoDigital("GTA V", "Acción", "PC", 20.00, 50);
		JuegoDigital juegoDigital2 = new JuegoDigital("Minecraft", "Sandbox", "PC", 19.95, 20);
		JuegoFisico juegoFisico1 = new JuegoFisico("God of War", "Aventura", "PS4", 20.00, "NUEVO", "en_stock");
		JuegoFisico juegoFisico2 = new JuegoFisico("Tekken", "Lucha", "PS2", 5.00, "USADO", "agotado");
		
		Cliente cliente1 = new Cliente("Pepe", "Calle Blasco Ibáñez, 1");
		Cliente cliente2 = new Cliente("María", "Calle Kansas City, 2");
		
		
	}
}
