package rxJava;

import io.reactivex.Observable;
import io.reactivex.Single;

public class defaultIfEmptyEx {
    public static void main(String[] args) {
        Observable<String> observable=Observable.just("pavan","kumar","sc")
                .filter(len->len.length()>100)
                .defaultIfEmpty("hi")   ;
                observable.subscribe(System.out::println);
        ObservableswitchIfempty();
    }

    static void ObservableswitchIfempty(){
        Observable observable=Observable.just(1,2,3,4)
                .filter(len->len>100)
                .switchIfEmpty(Observable.just(6,7,8,9).map(val->val*10))   ;
        observable.subscribe(System.out::println);
    }
}
