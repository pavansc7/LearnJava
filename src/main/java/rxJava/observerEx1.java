package rxJava;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class observerEx1 {

    public static void main(String[] args) {
        Observable<String> observable = Observable.just("pavan","kumar","sc","hello");
        observable.subscribe((string)->System.out.println(string),(error)->{System.out.println(error.getLocalizedMessage());},()->System.out.println("Completed"));

}
}