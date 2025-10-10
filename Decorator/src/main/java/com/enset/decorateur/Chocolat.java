package com.enset.decorateur;

import com.enset.composants.Boisson;

public class Chocolat extends Decorateur{


    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au chocolat";
    }
}
