package com.enset;

public class ZipCompressor extends Compresseur{
    @Override
    protected int[] preprocess(int[] data) {
        System.out.println("Prétraitement des données pour compression ZIP");
        return data;
    }

    @Override
    protected int[] applyCompression(int[] data) {
        System.out.println("Application de la compression ZIP");
        return data;
    }

    @Override
    protected int[] postprocess(int[] data) {
        System.out.println("Post-traitement des données compressées ZIP");
        return data;
    }
}
