package ar.fiuba.algo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GansoTest {

    // Ganso: 4 chapuzones (costo 2), 3 aleteos (costo 4), bonus descansado = 4
    // Energía descansado = (4 × 2) + (3 × 4) + 4 = 8 + 12 + 4 = 24
    // Energía luego de 1 chapuzón = (3 × 2) + (3 × 4) = 6 + 12 = 18

    @Test
    void gansoDescansadoTieneEnergiaInicial24() {
        Ganso ganso = new Ganso();
        assertEquals(24, ganso.energia());
    }

    @Test
    void gansoLuegoDe1ChapuzonQuedaCon18DeEnergia() {
        Ganso ganso = new Ganso();
        ganso.nada(1);
        assertEquals(18, ganso.energia());
    }

    @Test
    void gansoLuegoDe1AleteoQuedaCon16DeEnergia() {
        // (4 × 2) + (2 × 4) = 8 + 8 = 16 (pierde bonus)
        Ganso ganso = new Ganso();
        ganso.vuela(1);
        assertEquals(16, ganso.energia());
    }

    @Test
    void gansoPierdeBonusParaSiempreDespuesDeMoverse() {
        Ganso ganso = new Ganso();
        ganso.nada(1);
        // Ya no tiene bonus, energía = (3 × 2) + (3 × 4) = 18
        assertEquals(18, ganso.energia());
        // Vuela 1 vez más
        ganso.vuela(1);
        // (3 × 2) + (2 × 4) = 6 + 8 = 14
        assertEquals(14, ganso.energia());
    }
}
