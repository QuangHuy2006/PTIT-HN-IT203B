package demo.functional;

public class Main {
    public static void main(String[] args) {
        // lambda expression : là cú pháp viết gọn của 1 method dùng để tạo nhanh đối tượng từ functional interface

        // trước java 8 : tạo 1 class kế thừa interface, interface gọi constructor của lớp con
        IFunctional i1 = new Cat("ok");
        // lớp không tên
//        IFunctional i2 = new IFunctional() {
//            @Override
//            public void save() {
//
//            }
//        };

        // sau java 8:
        IFunctional i3 = (a,b) -> b;
    }
}
