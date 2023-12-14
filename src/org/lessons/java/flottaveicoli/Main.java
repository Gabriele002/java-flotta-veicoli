package org.lessons.java.flottaveicoli;

public class Main {
    public static void main(String[] args) {

                GestoreFlotta gestoreFlotta = new GestoreFlotta();

                gestoreFlotta.aggiungiVeicolo(new Automobile("BB123AA", 2020,3));
                gestoreFlotta.aggiungiVeicolo(new Motocicletta("BB123BB", 2020, true));
                System.out.println(gestoreFlotta);
    }
}
