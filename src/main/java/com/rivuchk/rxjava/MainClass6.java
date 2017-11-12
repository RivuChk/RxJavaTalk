package com.rivuchk.rxjava;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class MainClass6 {
    public static void main(String args[]) {
        Observable.range(20,80)
                .filter(n->n%2==0)
                .concatMap(n->
                        Observable.just(n)
                                .delay(1,TimeUnit.SECONDS)
                )
                .map(n->"Even "+n)
                .blockingSubscribe(emission ->
                        System.out.println("Received "+emission));
    }


}
