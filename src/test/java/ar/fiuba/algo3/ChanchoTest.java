package ar.fiuba.algo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChanchoTest {

    // Chancho Volador: 10 aleteos disponibles, cada aleteo cuesta 8 unidades
    // Energía inicial = 10 × 8 = 80

    @Test
    void chanchoNuevoTieneEnergiaInicial80() {
        Chancho chancho = new Chancho();
        assertEquals(80, chancho.energia());
    }

    @Test
    void chanchoLuegoDe2AleteosQuedaCon64DeEnergia() {
        // Caso de uso A: energía después de 2 aleteos = 8 × 8 = 64
        Chancho chancho = new Chancho();
        chancho.vuela(2);
        assertEquals(64, chancho.energia());
    }

    @Test
    void chanchoVuelaUnaVezYQuedaCon72DeEnergia() {
        Chancho chancho = new Chancho();
        chancho.vuela(1);
        assertEquals(72, chancho.energia());
    }

    }
