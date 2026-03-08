import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhập tổng số người dùng : ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập số lượng nhóm : ");
            int b = Integer.parseInt(sc.nextLine());
            int c = a / b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Không thể chia cho 0!");
        }finally{
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }
    }
}