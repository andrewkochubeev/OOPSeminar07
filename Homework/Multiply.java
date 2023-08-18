package Homework;

public class Multiply extends Operator {
    public Multiply(){
        name = "*";
    }
    @Override
    public Complex execute(Complex cmp1, Complex cmp2) {
        double a1 = cmp1.getReal();
        double b1 = cmp1.getImage();
        double a2 = cmp2.getReal();
        double b2 = cmp2.getImage();
        return new Complex(a1 * a2 - b1 * b2, a1 * b2 + b1 * a2);
    }

}
