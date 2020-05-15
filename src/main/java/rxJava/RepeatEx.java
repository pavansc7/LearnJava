package rxJava;

import io.reactivex.Observable;

public class RepeatEx {
    public static void main(String[] args) {
        Observable.just(1,2,3,4)
                .repeat(4)
                .subscribe(System.out::println);
    }
}
