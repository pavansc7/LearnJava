package rxJava;

import com.learn.java.impl.LearnLamba;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 23, 4, 5);
//     //   list.add(123);
//
//      List l = list.stream().map(v->v*10).collect(Collectors.toList());
//      l.stream().forEach((v)->System.out.println(v));

        Observable observale = Observable.just(1, 2, 3, 4);

        observale.subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println(integer);
            }
        });
        Observable newObj = Observable.create(emitter -> {
                    emitter.onNext(1);
                    emitter.onNext(2);
                    emitter.onNext(3);
                    emitter.onComplete();
                }
        );
newObj.subscribe((item)->System.out.println(item),error->{System.out.println(error);},()->System.out.println("Complete"));
Observable ob = new Observable() {
    @Override
    protected void subscribeActual(Observer observer) {
        System.out.println("NOthinG");
    }
};
ob.subscribe((val)->System.out.println(val));
    }
}