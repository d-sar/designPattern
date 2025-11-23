
package com.enset;

public class Main {
    public static void main(String[] args) {
    Personnage personnage = new Personnage();
    personnage.setComportementArme(new ComportementArctEtFliche());
    personnage.Combatrer();
        System.out.println("******************************************");
    Reine reine = new Reine();
    reine.setComportementArme(new ComportementArctEtFliche());
    reine.Combatrer();
        System.out.println("******************************************");
    Roi roi = new Roi();
    roi.setComportementArme(new ComportementHache() );
    roi.Combatrer();
        System.out.println("******************************************");
    Chevalier chevalier = new Chevalier();
    chevalier.setComportementArme(new ComportementPoignard());
    chevalier.Combatrer();

    }
}