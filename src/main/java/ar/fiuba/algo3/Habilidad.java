package ar.fiuba.algo3;

public abstract class Habilidad {
    protected float costoDeUnaVez;

    public Habilidad(float costo) {

        this.costoDeUnaVez = costo;
    }

    public abstract float hacer(int veces);
}
