package videojuego;

public class JuegoDigital extends Videojuego{
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
		return "JuegoFisico \n [titulo=" + super.getTitulo() + ", genero=" + super.getGenero() + ", plataforma=" + super.getPlataforma() + ", precio="
				+ super.getPrecio() + ", tamanoGB" + getTamanoGB() + "]";
	}
}