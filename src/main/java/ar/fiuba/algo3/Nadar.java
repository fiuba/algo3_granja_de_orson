package ar.fiuba.algo3;

public class Nadar extends Habilidad {

    public Nadar(float costo) {

        super(costo);
    }

    @Override
    public float hacer(int veces) {

        return costoDeUnaVez * veces;
    }
}
