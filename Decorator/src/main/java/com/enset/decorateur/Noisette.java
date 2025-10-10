package com.enset.decorateur;

import com.enset.composants.Boisson;

public class Noisette extends Decorateur{
    public Noisette(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription(){
        return boisson.getDescription() + " Au Noisette";
    }

    @Override
    public double cout() {
        return 3+boisson.cout();
    }
}
