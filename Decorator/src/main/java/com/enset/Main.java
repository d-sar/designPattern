package com.enset;

import com.enset.composants.Boisson;
import com.enset.composants.Deca;
import com.enset.composants.Expresso;
import com.enset.composants.Sumatra;
import com.enset.decorateur.Caramel;
import com.enset.decorateur.Chocolat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println((boisson.cout()));
        boisson = new Expresso();
        System.out.println(boisson.getDescription());
        System.out.println((boisson.cout()));

        System.out.println("***************");
        boisson = new Deca();
        System.out.println(boisson.getDescription());
        System.out.println((boisson.cout()));
        System.out.println("***************");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println((boisson.cout()));
        System.out.println("***************");
        boisson = new Chocolat(new Sumatra());
        System.out.println(boisson.getDescription());
        System.out.println((boisson.cout()));
        System.out.println("********b2*******");
Boisson boisson2;
boisson2 = new Sumatra();
System.out.println(boisson2.getDescription());
System.out.println((boisson2.cout()));
boisson2= new Chocolat(boisson2);
System.out.println(boisson2.getDescription());
System.out.println((boisson2.cout()));
boisson2= new Caramel(boisson2);
System.out.println(boisson2.getDescription());
System.out.println((boisson2.cout()));
boisson2 = new Caramel(boisson2);
System.out.println(boisson2.getDescription());
System.out.println((boisson2.cout()));


    }
}