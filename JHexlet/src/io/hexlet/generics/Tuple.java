package io.hexlet.generics;

public class Tuple<T1, T2> {

    private T1 left;
    private T2 right;

    public Tuple(final T1 left, final T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }
}

