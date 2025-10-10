package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CentralUnit centralUnit = new CentralUnit();
        centralUnit.setVga(new Ecran());
        centralUnit.print("hello Ecran");
        centralUnit.setVga(new VP());
        centralUnit.print("hello vp");
// la compisotion
        HdmiVgaAdapter adapter = new HdmiVgaAdapter();
        adapter.setHdmi(new Tv());
        centralUnit.setVga(adapter);
        centralUnit.print("hello");
        //

        // la heritage
        HdmiVgaAdapterH adapterH = new HdmiVgaAdapterH();
        centralUnit.setVga(adapterH);
        centralUnit.print("hello heritage");
        //

        centralUnit.setVga(new SuperVP());
        centralUnit.print("hello SuperVP");

        HdmiVgaAdapter adapter2 = new HdmiVgaAdapter();
        adapter2.setHdmi(new SuperVP());
        centralUnit.setVga(adapter2);
        centralUnit.print("hello SuperVP");
    }
}