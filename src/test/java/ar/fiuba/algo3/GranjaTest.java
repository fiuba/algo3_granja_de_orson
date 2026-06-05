package ar.fiuba.algo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GranjaTest {

    // Caso B: Energía de una Granja de Orson con pato, ganso y chancho nuevos
    // (15 + 24 + 80) × 1.10 = 119 × 1.10 = 130.9

    @Test
    void granjaConPatoGansoYChanchoNuevosTieneEnergia130punto9() {
        Granja granja = new Granja(new Pato(), new Ganso(), new Chancho());

        assertEquals(130.9f, granja.energia(), 0.01f);
    }

    @Test
    void granjaConUnSoloPatoTieneEnergia16punto5() {
        // 15 × 1.10 = 16.5
        Granja granja = new Granja(new Pato());

        assertEquals(16.5f, granja.energia(), 0.01f);
    }

    @Test
    void granjaVaciaTieneEnergia0() {
        Granja granja = new Granja();
        assertEquals(0f, granja.energia(), 0.01f);
    }
}
