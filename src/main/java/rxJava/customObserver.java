package rxJava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import randgennameint.RandSourceMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class customObserver {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("pavan","kumar","sc","hello");
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(String s) {
            System.out.println(s);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {

            }
        };
     observable.subscribe(observer);
        Map map = new RandSourceMap(10).keyValPair();

map.entrySet().forEach(System.out::println);

    }
}
