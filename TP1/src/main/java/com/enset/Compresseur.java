package com.enset;

public abstract class Compresseur {
    // Template Method - squelette de l'algorithme
    public final int[] compress(int[] data) {
        int[] preprocessedData = preprocess(data);
        int[] compressedData = applyCompression(preprocessedData);
        int[] finalResult = postprocess(compressedData);
        return finalResult;
    }

    // Étapes à implémenter par les sous-classes
    protected abstract int[] preprocess(int[] data);
    protected abstract int[] applyCompression(int[] data);
    protected abstract int[] postprocess(int[] data);
}
