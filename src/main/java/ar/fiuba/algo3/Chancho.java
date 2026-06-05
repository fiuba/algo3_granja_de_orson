package ar.fiuba.algo3;

public class Chancho implements Animal {
    private static final float COSTO_POR_ALETEO = 8;
    private float energiaTotalDisponible;

    private Habilidad volar;

    public Chancho() {
        this.energiaTotalDisponible = 10 * COSTO_POR_ALETEO;;
        this.volar = new Volar(COSTO_POR_ALETEO);
    }

    public void vuela(int veces) {
        this.energiaTotalDisponible -= volar.hacer(veces);
    }

    @Override
    public float energia() {
        return this.energiaTotalDisponible;
    }
}
