package Homework;

import java.util.ArrayList;
import java.util.List;

public class OperatorList {
    private List<Operator> operatorList = new ArrayList<>();

    public List<Operator> getOperatorList() {
        return operatorList;
    }

    public OperatorList(){
        operatorList.add(new Plus());
        operatorList.add(new Multiply());
        operatorList.add(new Divide());
    }
}
