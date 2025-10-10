package com.enset.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
private List<Integer> historique = new ArrayList<>();
    @Override
    public void update(int newState) {
        historique.add(newState);
        double sum=0;
        for (int i = 0; i < historique.size(); i++) {
            sum += historique.get(i) + 1;
        }
        System.out.println("moyen = " +sum/historique.size());

    }
}
