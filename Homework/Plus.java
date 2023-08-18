package Homework;

public class Plus extends Operator {
    public Plus(){
        name = "+";
    }
    @Override
    public Complex execute(Complex cmp1, Complex cmp2) {
        return new Complex(cmp1.getReal() + cmp2.getReal(), cmp1.getImage() + cmp2.getImage());
    }

}
