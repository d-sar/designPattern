package com.enset;

public class Adapter implements IFilter {
    private ImplNonStandard implNonStandard;
    private String filterName;

    public Adapter(String filterName, ImplNonStandard implNonStandard) {
        this.implNonStandard = new ImplNonStandard();
        this.filterName = filterName;
    }
    @Override
    public int[] filter(int[] data) {
        return implNonStandard.appliquerFiltre(filterName, data);
    }
}
