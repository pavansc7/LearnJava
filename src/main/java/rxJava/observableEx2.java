package rxJava;

import io.reactivex.Single;

public class observableEx2 {
    public static void main(String[] args) {
        Single<String> single = Single.just("pavan");
        single.subscribe((val)->System.out.println(val));
    }
}
