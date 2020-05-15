package rxJava;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class singleObervable {
    public static void main(String[] args) {
        Single<String> single = Single.just("Pavan");
        single.subscribe(System.out::println);

     SingleObserver singleObserver= new SingleObserver() {
         @Override
         public void onSubscribe(Disposable disposable) {

         }

         @Override
         public void onSuccess(Object o) {

         }

         @Override
         public void onError(Throwable throwable) {

         }
     };

        single.subscribe(singleObserver);
    }
}
