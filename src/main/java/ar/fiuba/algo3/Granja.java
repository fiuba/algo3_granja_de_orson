package ar.fiuba.algo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Granja {
    private static final float BONUS_GRANJA = 1.10f;

    private List<Animal> animales;

    public Granja(Animal... animales) {
        this.animales = new ArrayList<>();
        Collections.addAll(this.animales, animales);
    }

    public float energia() {
        float energiaTotal = 0;
        for (Animal animal : animales) {
            energiaTotal += animal.energia();
        }
        return energiaTotal * BONUS_GRANJA;
    }
}
