package com.enset;

public class HdmiVgaAdapterH  extends Tv implements VGA{
    @Override
    public void print(String message) {
        System.out.println("*************Adapter*************");
        byte[] bytes=message.getBytes();
        super.show(bytes);
        System.out.println("************ / Adapter**************");
    }

}
