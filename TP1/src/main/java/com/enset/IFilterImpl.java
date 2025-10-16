package com.enset;

public class IFilterImpl implements IFilter {

    @Override
    public int[] filter(int[] data) {
        System.out.println("Application du filtre : IfilterImpl1.. ");
        return data;
    }
}
