package com.enset.decorateur;

import com.enset.composants.Boisson;

public abstract class Decorateur extends Boisson {
    protected Boisson boisson;
    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }

}
