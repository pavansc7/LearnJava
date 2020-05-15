package rxJava;

import io.reactivex.Observable;

public class DoOnNext {
    public static void main(String[] args) {
        Observable.just(11,2,3)
                .doOnNext(val->System.out.println(val+ "  from do on next"))
                .subscribe(System.out::println);
    }
}
