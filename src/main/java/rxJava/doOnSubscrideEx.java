package rxJava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class doOnSubscrideEx {
    public static void main(String[] args) {
        Observable.just(1,2,3)

                .doOnSubscribe(val->System.out.println("Subscribed"+val.getClass()))
                .subscribe((val)->System.out.println(val),(error)->System.out.println(error.getLocalizedMessage()),
                        ()->System.out.println("complete"),(val)->System.out.println("On subscribe"));


    }
}
