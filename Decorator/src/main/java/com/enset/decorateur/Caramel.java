package com.enset.decorateur;

import com.enset.composants.Boisson;

public class Caramel extends Decorateur {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Caramel";
    }
    @Override
    public double cout() {
        return 2+boisson.cout();
    }
}
