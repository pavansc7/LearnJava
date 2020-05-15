package rxJava;

import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.concurrent.TimeUnit;

public class take {
    public static void main(String[] args) throws InterruptedException {
        Single.error(new Exception())
              //  .take(5,TimeUnit.SECONDS)
                //.filter((item)->it<3)
              //  .distinct(len->{return len*10;})
                //.elementAt(20)

                .doOnSuccess(System.out::println)
                .doOnError(val->System.out.println("failed"));
            //    .do
              //  .subscribe(System.out::println);

      //  System.out.println("hi");
       // Thread.sleep(600000);
    }
}
