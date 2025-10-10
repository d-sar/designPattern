package com.enset;

public class HdmiVgaAdapter implements VGA{
    private  Hdmi hdmi;
    @Override
    public void print(String message) {
        byte[] bytes=message.getBytes();
        hdmi.show(bytes);

    }
    public void setHdmi (Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
