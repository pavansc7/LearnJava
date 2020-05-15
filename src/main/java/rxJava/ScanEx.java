package rxJava;

import io.reactivex.Observable;

public class ScanEx {
    public static void main(String[] args) {
        Observable.just(1,2,3,5)
                .scan(10,(acc,item)->acc*item)
                .subscribe(System.out::println);

        Observable.just("pavan","kumar","sc")
                .scan((acc,val)->acc+val)
                .subscribe(System.out::println);
    }
}
