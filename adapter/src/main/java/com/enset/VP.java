package com.enset;

public class VP implements VGA{
    @Override
    public void print(String message) {
        System.out.println("*********VP avec VGA*****************");
        System.out.println(message);
        System.out.println("***********VP vga***************");
    }
}
