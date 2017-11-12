package com.rivuchk.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainClass3 {
    public static void main(String args[]) {
        String[] array = {"str 1", "str 2", "str 3", "str 4"};
        Observable.fromArray(array)
                .map(item->item+" modified")
                .subscribe(
                        item -> System.out.println("Received "+item)
                );
    }


}
