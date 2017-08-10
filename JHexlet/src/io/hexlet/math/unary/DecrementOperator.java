package io.hexlet.math.unary;

public class DecrementOperator extends UnaryOperator {
    //BEGIN (write your solution here)
    @Override
    public int apply(int a) {
        return --a;
    }
    //END
}

