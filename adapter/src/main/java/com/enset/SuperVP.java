package com.enset;

public class SuperVP  implements VGA,Hdmi{
    @Override
    public void show(byte[] data) {
        String s = new String(data);
        System.out.println("*************Super vp Hdmi*************");
        System.out.println(s);
        System.out.println("**************Super vp Hdmi**************");
    }

    @Override
    public void print(String message) {
        System.out.println("************Super vp Vga**************");
        System.out.println(message);
        System.out.println("**************Super vp Vga***************");

    }
}
