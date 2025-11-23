package com.enset;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }

    @Override
    public void afficher() {
        System.out.println("+ Folder : " + name);
        for (Component c : children) {
            c.afficher();
        }
    }
}
