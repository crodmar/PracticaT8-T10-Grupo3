package videojuego;

import java.util.Objects;

import enumerados.*;

public class JuegoFisico extends Videojuego{

	private Estado estado;
	private Disponibilidad disponibilidad ;
	
	public JuegoFisico() {
		
	}

	public JuegoFisico(String titulo, String genero, String plataforma, double precio, String Estado, String Disponibilidad) {
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
		return "JuegoFisico \n [titulo=" + super.getTitulo() + ", genero=" + super.getGenero() + ", plataforma=" + super.getPlataforma() + ", precio="
				+ super.getPrecio() + ", estado=" + estado + ", disponibilidad=" + disponibilidad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		JuegoFisico juegoFisico = (JuegoFisico) obj;
		return super.equals(juegoFisico) && this.estado.equals(juegoFisico.estado) && this.disponibilidad.equals(juegoFisico.disponibilidad);
	}

	
}
