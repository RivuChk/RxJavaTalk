package com.rivuchk.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class MainClass2 {
    public static void main(String args[]) {
        String[] array = {"str 1", "str 2", "str 3", "str 4"};
        Observable.fromArray(array).subscribe(
                new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("Subscribed");
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println("next "+s);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("Error "+e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Completed");
                    }
                }
        );
    }


}
