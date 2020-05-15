package com.learn.java;

//import com.learn.java.impl.ImplGetName;
import com.learn.java.impl.ImplGetName;
import com.learn.java.impl.LearnLamba;
import com.learn.java.interfaces.GetName;
import org.json.simple.JSONObject;
import com.learn.java.staticClasses.StaticImpl;
public class Main {
    public static void main(String args[]) {
        GetName getName = (value) -> {
            return "I am lamba definitation " + value;
        };
// LearnLamba lamb = new LearnLamba(getName);
// lamb.doNothing();
        GetName gt = callMethod();
        System.out.println("I am JAAAAAAAAAAAR");
    }

    static GetName callMethod() {
        GetName g = new GetName() {
            @Override
            public String getName(String name) {
                return null;
            }

        };
        return g;
    }

}