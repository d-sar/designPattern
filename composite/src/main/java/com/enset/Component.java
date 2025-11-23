package com.enset;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public abstract void afficher();
}

