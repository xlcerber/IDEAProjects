package io.hexlet.generics;

public class Box<T> {
    // BEGIN (write your solution here)
    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
    // END


