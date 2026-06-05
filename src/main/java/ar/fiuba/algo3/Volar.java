package ar.fiuba.algo3;

public class Volar extends Habilidad {

    public Volar(float costo) {

        super(costo);
    }

    @Override
    public float hacer(int veces) {

        return costoDeUnaVez * veces;
    }
}
