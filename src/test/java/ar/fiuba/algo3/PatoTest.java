package ar.fiuba.algo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatoTest {

    // Pato: 3 chapuzones disponibles, cada chapuzón cuesta 5 unidades
    // Energía inicial = 3 × 5 = 15

    @Test
    void patoNuevoTieneEnergiaInicial15() {
        Pato pato = new Pato();
        assertEquals(15, pato.energia());
    }

    @Test
    void patoLuegoDe1ChapuzonQuedaCon10DeEnergia() {
        Pato pato = new Pato();
        pato.nada(1);
        assertEquals(10, pato.energia());
    }

    @Test
    void patoLuegoDe2ChapuzonesQuedaCon5DeEnergia() {
        Pato pato = new Pato();
        pato.nada(2);
        assertEquals(5, pato.energia());
    }

    @Test
    void patoEsUnAnimal() {
        Pato pato = new Pato();
        assertTrue(pato instanceof Animal);
    }
}
