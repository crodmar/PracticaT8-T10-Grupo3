package Comparador;

import java.util.Comparator;

import videojuego.Videojuego;

public class ComparadorPrecio implements Comparator<Videojuego> {

    @Override
    public int compare(Videojuego juego1, Videojuego juego2) {
        if (juego1.getPrecio() < juego2.getPrecio()) {
            return -1;
        } else if (juego1.getPrecio() > juego2.getPrecio()) {
            return 1;
        } else {
            return 0;
        }
    }
}