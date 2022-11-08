public abstract class Test {
    abstract void toDo();
    void doPrint() {
        System.out.println("Hello!");
    }
}

class Base extends Test {

    @Override
    void toDo() {

    }
}
