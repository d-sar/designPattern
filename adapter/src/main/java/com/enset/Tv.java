package com.enset;

public class Tv implements Hdmi{
    @Override
    public void show(byte[] data) {
        System.out.println("Tv show");
        System.out.println(new String(data));
        System.out.println("Tv show");
    }
}
