package ar.fiuba.algo3;

public class Ganso implements Animal {
    private static final float COSTO_POR_CHAPUZON = 2;
    private static final float COSTO_POR_ALETEO = 4;
    private static final float BONUS_DESCANSADO = 4;

    private float energiaTotalDisponibleParaNadar;
    private float energiaTotalDisponibleParaVolar;
    private boolean descansado;

    private Habilidad nadar;
    private Habilidad volar;

    public Ganso() {
        this.energiaTotalDisponibleParaNadar = 4 * COSTO_POR_CHAPUZON;
        this.energiaTotalDisponibleParaVolar = 3 * COSTO_POR_ALETEO;
        this.descansado = true;
        this.nadar = new Nadar(COSTO_POR_CHAPUZON);
        this.volar = new Volar(COSTO_POR_ALETEO);
    }

    public void nada(int veces) {
        this.descansado = false;
        this.energiaTotalDisponibleParaNadar -= nadar.hacer(veces);
    }

    public void vuela(int veces) {
        this.descansado = false;
        this.energiaTotalDisponibleParaVolar -= volar.hacer(veces);
    }

    @Override
    public float energia() {
        float energiaBase = this.energiaTotalDisponibleParaNadar + this.energiaTotalDisponibleParaVolar;
        if (this.descansado) {
            return energiaBase + BONUS_DESCANSADO;
        }
        return energiaBase;
    }
}
