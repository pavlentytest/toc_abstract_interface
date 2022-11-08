
interface Calculable {
    int mult(int a, int b);
}


public interface Calc {
    void action();
    void action23();
}
interface Switcher {
    void off();
    void on();
}
class Calculator implements Calc, Switcher {

    @Override
    public void action() {

    }

    @Override
    public void action23() {

    }

    @Override
    public void off() {

    }

    @Override
    public void on() {

    }
}
