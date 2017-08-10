package io.hexlet.generics;

public class Triple <T1, T2, T3> extends Tuple<T1, T3> {

    private T2 middle;

    public Triple (final T1 left, final T2 middle, final T3 right) {
        super(left, right);
        this.middle = middle;
    }

    public T2 getMiddle() {
        return middle;
    }
}

