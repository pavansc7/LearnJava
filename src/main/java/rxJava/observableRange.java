package rxJava;

import io.reactivex.Observable;

public class observableRange {
    public static void main(String[] args) {
        int start = 1,end=20;
        Observable observable = Observable.range(start,end);
        observable.subscribe(System.out::println);
        start=30;end=40;
        observable.subscribe(System.out::println);
    }
}
