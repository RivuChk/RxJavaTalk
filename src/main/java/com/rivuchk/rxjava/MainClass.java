package com.rivuchk.rxjava;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class MainClass {
    public static void main(String args[]) {
        Subject<String> myStringObserver = PublishSubject.create();
        myStringObserver.subscribe(x->{
            System.out.println(x);
        });
        myStringObserver.onNext("My String");
        myStringObserver.onNext("erferfe");
    }


}
