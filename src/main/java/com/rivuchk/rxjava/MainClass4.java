package com.rivuchk.rxjava;

import io.reactivex.Observable;

public class MainClass4 {
    public static void main(String args[]) {
        Observable.range(1,10)
                .filter(n->n%2==0)
                .map(n->"Even "+n)
                .subscribe(emission -> System.out.println("Received "+emission));
    }


}
