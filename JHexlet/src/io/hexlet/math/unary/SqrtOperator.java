package io.hexlet.math.unary;

public class SqrtOperator extends UnaryOperator {
    //use the return line "return (int)Math.sqrt((double) a);"
    //BEGIN (write your solution here)

    @Override
    public int apply(int a) {
        return (int)Math.sqrt((double) a);
    }
    //END
}

