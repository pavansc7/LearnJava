package rxJava;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.Date;

public class errorEx {

    public static void main(String[] args) {
Observable<Integer> observable = Observable.just((new Date()).getSeconds());
observable.subscribe((val)->System.out.println(val),(error)->System.out.println(error.getLocalizedMessage()));
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("From Print"+ (new Date()).getSeconds());
        observable.subscribe((val)->System.out.println(val),(error)->System.out.println(error.getLocalizedMessage()));
    }
}
