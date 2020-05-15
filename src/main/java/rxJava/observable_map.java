package rxJava;

import io.reactivex.Observable;
import com.learn.java.interfaces.GetName;
public class observable_map {
    public static void main(String[] args) {
        Observable <GetName> observable = Observable.just(new GetName() {
            @Override
            public String getName(String name) {
                System.out.println("yoyoyo123");
                return "null";
            }
        });

        observable.map((val)->{ System.out.println("hi");
        return new GetName() {
            @Override
            public String getName(String name) {
                System.out.println("yoyoyo545432");
                return "null";
            }
            };
        })
              //  .filter(val->false)
        .subscribe((val)->{ System.out.println(val.getName("val")); });
    }
}
