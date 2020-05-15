package rxJava;

import io.reactivex.Observable;

import java.io.IOException;

public class ReTryEx {
    public static void main(String[] args) {
        Observable.just(1,2,3,new Exception())
                .doOnError(val->System.out.println(" on e=rr"))

                .retry(val ->
                {   System.out.println("ERROR RETRY");
                     if ( val instanceof Error) return true;
                     else return false;

                })
                .subscribe(val->System.out.println(" i am subscriber"+val));
    }
}
