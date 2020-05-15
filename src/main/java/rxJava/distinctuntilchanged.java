package rxJava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;

public class distinctuntilchanged {
    public static void main(String[] args) {
        Observable.just("pav","kum","hema","chid")
                .distinctUntilChanged(String::length)
                .subscribe(System.out::println);

    }
}
