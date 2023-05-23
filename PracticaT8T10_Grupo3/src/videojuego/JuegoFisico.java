package videojuego;

import java.util.Objects;

import enumerados.*;
import interfaces.Entregable;

public class JuegoFisico extends Videojuego implements Entregable {

	private Estado estado;
	private Disponibilidad disponibilidad;

	public JuegoFisico() {

	}

	public JuegoFisico(String titulo, String genero, String plataforma, double precio, String Estado,
			String Disponibilidad) {
		super(titulo, genero, plataforma, precio);
		setDisponibilidad(Disponibilidad);
		setEstado(Estado);
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = Estado.valueOf(estado);
	}

	public Disponibilidad getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = Disponibilidad.valueOf(disponibilidad);
	}

	@Override
	public String toString() {
		return "JuegoFisico \n [titulo=" + super.getTitulo() + ", genero=" + super.getGenero() + ", plataforma="
				+ super.getPlataforma() + ", precio=" + super.getPrecio() + ", estado=" + estado + ", disponibilidad="
				+ disponibilidad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		JuegoFisico juegoFisico = (JuegoFisico) obj;
		return super.equals(juegoFisico) && this.estado.equals(juegoFisico.estado)
				&& this.disponibilidad.equals(juegoFisico.disponibilidad);
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
