package videojuego;

import interfaces.Entregable;

public class JuegoDigital extends Videojuego implements Entregable {
	private double tamanoGB;

	public JuegoDigital(String titulo, String genero, String plataforma, double precio, double tamanoGB) {
		super(titulo, genero, plataforma, precio);
		this.tamanoGB = tamanoGB;
	}

	public double getTamanoGB() {
		return tamanoGB;
	}

	public void setTamanoGB(double tamanoGB) {
		this.tamanoGB = tamanoGB;
	}

	@Override
	public String toString() {
		return "JuegoFisico \n [titulo=" + super.getTitulo() + ", genero=" + super.getGenero() + ", plataforma="
				+ super.getPlataforma() + ", precio=" + super.getPrecio() + ", tamanoGB" + getTamanoGB() + "]";
	}

	@Override
	public void entregar(Cliente cliente) {
		for (Videojuego v : cliente.getVideojuegosComprados()) {
			if (v.equals(this)) {
				if (!this.isEntregado()) {
					this.setEntregado(true);
					System.out.println("El videojuego " + this + " ha sido entregado.");
				} else {
					System.out.println("El videojuego " + this + " estaba entregado.");
				}
			}
		}
	}
}