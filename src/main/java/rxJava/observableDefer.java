package rxJava;

import io.reactivex.Observable;

public class observableDefer {
    static int start = 10,end=20;
    public static void main(String[] args) {

        Observable observable = Observable.defer(()->Observable.range(start,end));

        observable.subscribe(System.out::println);
        start=50; end=10;
        observable.subscribe(System.out::println);
    }
}
