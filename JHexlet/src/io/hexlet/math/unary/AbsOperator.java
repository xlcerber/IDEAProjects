package io.hexlet.math.unary;

public class AbsOperator extends UnaryOperator {
    //BEGIN (write your solution here)
    @Override
    public int apply(int a) {
        return Math.abs(a);
    }
    //END
}
