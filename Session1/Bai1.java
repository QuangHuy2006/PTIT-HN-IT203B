import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhập số tuổi : ");
            int a = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Lỗi không phải số");
        }finally{
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }
    }
}