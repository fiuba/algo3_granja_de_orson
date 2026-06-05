package ar.fiuba.algo3;

public class Pato implements Animal {
    private static final float COSTO_POR_CHAPUZON = 5;
    private float energiaTotalDisponible;

    private Habilidad nadar;

    public Pato() {
        this.energiaTotalDisponible = 3 * COSTO_POR_CHAPUZON;
        this.nadar = new Nadar(COSTO_POR_CHAPUZON);
    }

    public void nada(int veces) {

        this.energiaTotalDisponible -= nadar.hacer(veces);
    }

    @Override
    public float energia() {
        return this.energiaTotalDisponible;
    }
}
