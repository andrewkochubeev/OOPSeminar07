package Homework;

public class Divide extends Operator{
    public Divide(){
        name = "/";
    }
    @Override
    public Complex execute(Complex cmp1, Complex cmp2) {
        double a1 = cmp1.getReal();
        double b1 = cmp1.getImage();
        double a2 = cmp2.getReal();
        double b2 = cmp2.getImage();
        double real = (a1*a2+b1*b2)/(a2*a2+b2*b2);
        double image = (a2*b1-a1*b2)/(a2*a2+b2*b2);
        return new Complex(real, image);
    }
    
}
