package learn.gen.collec;

import java.util.function.BiFunction;
import java.util.function.Consumer;

@FunctionalInterface
public  interface CommandStateTask extends BiFunction {

    static  CommandStateTask succeededTask() {
        return (taskContext, userContext) -> "abc";
    }

    static  CommandStateTask failedTask() {
        return (taskContext, userContext) -> "cde";
    }
}
