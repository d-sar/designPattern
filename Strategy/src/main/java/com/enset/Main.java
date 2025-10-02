
package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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