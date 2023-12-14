package org.lessons.java.flottaveicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {
    private List<Veicolo> veicoli;

    public GestoreFlotta() {
        veicoli = new ArrayList<>();
    }

    public void aggiungiVeicolo(Veicolo veicolo) {
        /*for (Veicolo newVeicolo : veicoli) {
            if (newVeicolo.getTarga().equals(veicolo.getTarga())) {
                System.out.println("Impossibile aggiungere il veicolo. Targa già presente.");
            } else {
                veicoli.add(veicolo);
            }
        }
         */
        veicoli.add(veicolo);
    }

    public Veicolo trovaVeicolo(String targa) {
        for (Veicolo veicolo : veicoli) {
            if (veicolo.getTarga().equals(targa)) {
                return veicolo;
            }
        }
        return null;
    }

    public int contatore (String tipo) {
        int counter = 0;
        for (Veicolo veicolo : veicoli) {
            if (veicolo instanceof Automobile) {
                counter++;
            } else if (veicolo instanceof Motocicletta) {

            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "GestoreFlotta{" +
                "veicoli=" + veicoli +
                '}';
    }
}

