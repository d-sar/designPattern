package com.enset;

import com.enset.obs.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl() ;
        Observer o1 = new ObserverImpl2() ;
        Observer o2 = new ObserverImpl() ;
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.setState(60);
        observable.setState(40);
        observable.unsubscribe(o2);
        observable.setState(80);


    }
}