package Homework;

public class Controller {
    private Viewer viewer = new Viewer();
    private OperatorList operatorList = new OperatorList();
    private Logger logger = new Logger();

    public void start() {
        Complex cmp1 = viewer.inputComplex("Введите первое комплексное число:");
        while (true) {
            String op = viewer.inputString("Введите операцию (+, *, /, пустой оператор - выход):");
            if (op.equals("")) {
                viewer.printmsg("Завершение работы...");
                break;
            }
            if (!op.equals("")&&!op.equals("+")&&!op.equals("*")&&!op.equals("/")){
                viewer.printmsg("Некорректный оператор!");
                continue;
            }
            Complex cmp2 = viewer.inputComplex("Введите следующее комплексное число:");
            if (op.equals("/") && cmp2.equals("0")) {
                viewer.printmsg("Деление на ноль! Введите другую операцию или число");
                continue;
            }
            for (Operator operator : operatorList.getOperatorList()) {
                if (op.equals(operator.getName())) {
                    cmp1 = operator.execute(cmp1, cmp2);
                    logger.logResult(cmp1);
                    viewer.outputComplex("Результат: ", cmp1);
                }
            }

        }
    }
}
