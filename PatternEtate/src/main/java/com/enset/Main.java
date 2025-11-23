package com.enset;

import com.enset.state.Avion;
import com.enset.state.AvionImp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Avion avion=new AvionImp();
        avion.doActivity();
        avion.entrerAuGarage();
        avion.doActivity();
        avion.atterir();
        avion.sortirDuGarage();
        avion.decoller();
        avion.atterir();
        avion.entrerAuGarage();
        avion.doActivity();
        avion.decoller();
        avion.atterir();
    }
}