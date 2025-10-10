package com.enset.obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("new state " +newState);


    }
}
