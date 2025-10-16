package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         ImageFremwork imageFremwork = new ImageFremwork();
        // Données d'image simulées
        int[] image = {100, 150, 200, 50, 180, 90, 210, 75, 160, 110};
        System.out.println("Image originale: " + java.util.Arrays.toString(image));

        //test filtre 1
        System.out.println("-------------------------");
        imageFremwork.setIfilter(new IFilterImpl());
        int [] filterd = imageFremwork.filter(image);
        System.out.println("Image filtered: " + java.util.Arrays.toString(filterd));
        imageFremwork.setIfilter(new IFilterImpl2());
        filterd = imageFremwork.filter(image);
        System.out.println("Image filtered: " + java.util.Arrays.toString(filterd));
        // Test filtre non standard
        System.out.println("-------------------------");
        ImplNonStandard implNonStandard = new ImplNonStandard();
        imageFremwork.setIfilter(new Adapter("test",implNonStandard));
        imageFremwork.filter(image);

        // Test compression ZIP
        System.out.println("-------------------------");
        imageFremwork.setCompresseur(new ZipCompressor());
        int [] comressed = imageFremwork.compress(image);
        System.out.println("Image compressed: " + java.util.Arrays.toString(comressed));

    }
}