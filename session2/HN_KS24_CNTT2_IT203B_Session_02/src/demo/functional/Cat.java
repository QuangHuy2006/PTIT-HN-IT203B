package demo.functional;

public class Cat implements IFunctional {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int save(int a, int b) {
        return b;
    }
}
