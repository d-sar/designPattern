package com.enset;

public class IFilterImpl2 implements IFilter {
    @Override
    public int[] filter(int[] data) {
        System.out.println("Application du filtre : IFilterImpl2..");
        return data;
    }
}
