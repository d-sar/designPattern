package com.enset;

public class Personnage {
    private ComportementArme comportementArme;
    public void Combatrer(){
        System.out.println("le comportement arme utiliser est : "  );
        comportementArme.utiliserArme();
    }
    public void setComportementArme(ComportementArme comportementArme) {
        this.comportementArme = comportementArme;
    }
}
