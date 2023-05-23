package videojuego;

public class Videojuego implements Comparable{

	private String titulo;
	private String genero;
	private String plataforma;
	private double precio;
	private boolean entregado;
	
	public Videojuego() {
		this.titulo = "generico";
		this.genero = "generico";
		this.plataforma = "generico";
		this.precio = 1;
		this.entregado = false;
	}
	
	public Videojuego(String titulo, String genero, String plataforma, double precio) {
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new ArithmeticException("El precio debe ser mayor que 0");
		}
		this.entregado = false;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new ArithmeticException("El precio debe ser mayor que 0");
		}
	}

	
	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}


	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", plataforma=" + plataforma + ", precio="
				+ precio + ", entregado=" + entregado + "]";
	}

	@Override
    public boolean equals(Object obj) {
        Videojuego otro = (Videojuego) obj;
        return this.getTitulo().equalsIgnoreCase(otro.getTitulo())
                && this.getGenero().equalsIgnoreCase(otro.getGenero()) 
                && this.getPlataforma().equalsIgnoreCase(otro.getPlataforma())
                && this.getPrecio() == otro.getPrecio()
        		&& this.isEntregado() == otro.isEntregado();
    }
	

	@Override
	public int compareTo(Object arg0) {
		Videojuego otro = (Videojuego) arg0;		
		return this.getTitulo().compareTo(otro.getTitulo());
	}
	
	
	
}
