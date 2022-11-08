public class Main {
    public static void main(String[] args) {

        Test test = new Test();

        Test test1 = new Test() {
            @Override
            void toDo() {

            }
        };
        test1.toDo();
        test1.doPrint();

        Base base = new Base();
        base.toDo();


        Calc calc = new Calc() {
            @Override
            public void action() {

            }

            @Override
            public void action23() {

            }
        };
        calc.action();
        calc.action23();
     
        Calculable calc2 = new Calculable() {
            @Override
            public int mult(int a, int b) {
                return a*b;
            }
        };

        Calculable calc3 = (a, b) -> {
            a *= 100;
            b += 200;
            return a*b;
        };
        System.out.println(calc3.mult(3,4));

    }
}