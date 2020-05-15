package rxJava.Observables_Types;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableJust;

import java.util.Random;

public class UsingManualObservable {
    public static void main(String[] args) {
        Observable observable = new Observable() {
            @Override
            protected void subscribeActual(Observer observer) {
                observer.onSubscribe(new Disposable() {
                    @Override
                    public void dispose() {
                        System.out.println("Disposed");
                    }

                    @Override
                    public boolean isDisposed() {
                        return false;
                    }
                });
                observer.onNext(10);
                observer.onNext(20);
                observer.onNext(30);

                observer.onComplete();
            }

            ;

        };
Observer observer = new Observer() {
    @Override
    public void onSubscribe(Disposable disposable) {
        System.out.println("Oberver  started");
    }

    @Override
    public void onNext(Object o) {
        System.out.println(o);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Error");
    }

    @Override
    public void onComplete() {
        System.out.println("completed");
    };
};

observable.subscribe(observer);


// Using CreateObservale

        Observable createObservable = new ObservableCreate(new ObservableOnSubscribe() {
            @Override
            public void subscribe(ObservableEmitter observableEmitter) throws Exception {
                observableEmitter.onNext("val1");
                observableEmitter.onNext("val2");

            }
        });
    }

    static int getNumber() {
        return new Random().nextInt(100);
    }
}
