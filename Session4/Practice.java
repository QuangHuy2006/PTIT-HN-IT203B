public class Practice {
    // phương thưức kiểm tra số nguyên tố
    public boolean sont(int a){
        if(a < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                return false;
            }
        }

        return true;
    }

    // Phương thức tính số fibonaci thứ n
    public int fibonacci(int n){
        int first = 0;
        int second = 1;
        int result = 0;
        if(n < 0){
            throw new IllegalArgumentException("Số không được âm");
        }
        if(n < 1){
            return n;
        }

        for(int i = 0; i < n - 1; i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;

    }

    // Xây dựng các test case cho tất cả các trường hợp
}
