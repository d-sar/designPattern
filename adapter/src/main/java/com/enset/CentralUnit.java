package com.enset;

public class CentralUnit {
    private VGA vga;

    public void print(String message) {
        System.out.println("**********Central Unit****************");
        vga.print(message);
        System.out.println("***************Central Unit***********");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
