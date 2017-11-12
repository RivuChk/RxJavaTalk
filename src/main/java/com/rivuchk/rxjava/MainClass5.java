package com.rivuchk.rxjava;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class MainClass5 {
    public static void main(String args[]) {
        Observable.interval(1, TimeUnit.SECONDS)
                .take(25)
                .blockingSubscribe(count->System.out.println(count
                        +" seconds passed"));

    }


}
