package com.enset;



public class ImageFremwork {
    private IFilter ifilter;
    private Compresseur compresseur;

    public ImageFremwork() {
        this.ifilter = new IFilterImpl();
        this.compresseur = new ZipCompressor();
    }

    public void setIfilter(IFilter ifilter) {
        this.ifilter = ifilter;
    }
    public void setCompresseur(Compresseur compresseur) {
        this.compresseur = compresseur;
    }

    // Opérations principales
    public int[] filter(int[] data) {
        return ifilter.filter(data);
    }

    public int[] compress(int[] data) {
        return compresseur.compress(data);
    }
}
