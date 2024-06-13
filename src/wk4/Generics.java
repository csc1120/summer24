package wk4;

import java.util.function.Predicate;

public class Generics<T> implements Predicate<T> {
    @Override
    public boolean test(T t) {
        return false;
    }
}
