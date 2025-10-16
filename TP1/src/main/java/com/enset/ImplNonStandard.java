package com.enset;

public class ImplNonStandard implements IFilterAncienne{
    @Override
    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Ancien filtre : " + filterName);
        return data;
    }
}
