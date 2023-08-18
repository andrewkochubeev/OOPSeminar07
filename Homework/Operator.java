package Homework;

public abstract class Operator {
    protected String name;
    
    public String getName() {
        return name;
    }

    public abstract Complex execute(Complex cmp1, Complex cmp2);
}
