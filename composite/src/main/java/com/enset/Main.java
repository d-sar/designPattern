package com.enset;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Folder root = new Folder("Root");

        File f1 = new File("document.txt");
        File f2 = new File("photo.png");

        Folder subFolder = new Folder("SubFolder");
        File f3 = new File("file3.pdf");

        subFolder.add(f3);

        root.add(f1);
        root.add(f2);
        root.add(subFolder);

        root.afficher();
    }
}
