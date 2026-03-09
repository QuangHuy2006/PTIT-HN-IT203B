package demo.functional;

public interface IColorable {
    String RED = "red";

    void printColor(String color);

    // java 8
    default void draw() {
        System.out.println("Draw");
    }

    // chỉ truy cập được bằng tên interface
    static void erase() {

    }

    // java 9
    private void toStr(){

    }
}
