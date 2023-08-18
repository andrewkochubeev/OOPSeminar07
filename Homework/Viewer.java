package Homework;

import java.util.Scanner;

public class Viewer {
    private Scanner scanner = new Scanner(System.in);
    public void printmsg(String msg){
        System.out.println(msg);
    }
    public Complex inputComplex(String msg){
        printmsg(msg);
        printmsg("Введите действительную часть:");
        double a = Double.parseDouble(scanner.nextLine());
        printmsg("Введите мнимую часть:");
        double b = Double.parseDouble(scanner.nextLine());
        return new Complex(a, b);
    }
    public String inputString(String msg){
        printmsg(msg);
        return scanner.nextLine();
    }
    public void outputComplex(String msg, Complex cmp){
        System.out.println(msg + cmp);
    }
}
