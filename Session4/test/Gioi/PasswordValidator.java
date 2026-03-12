package Session4.test.Gioi;

public class PasswordValidator {
    public String evaluatePasswordStrength(String password){
        if(password == null){
            return "Yếu";
        }

        if(password.length() < 8){
            return "Yếu";
        }

        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasLowercase = password.matches(".*[a-z].*");
        boolean hasDigit     = password.matches(".*[0-9].*");
        boolean hasSpecial   = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

        int count = 0;
        if(hasUppercase){
            count++;
        }

        if(hasLowercase){
            count++;
        }

        if(hasDigit){
            count++;
        }

        if(hasSpecial){
            count++;
        }

        if(count == 4){
            return "Mạnh";
        }
        else if(count == 3) {
            return "Trung bình";
        }
        else{
            return "Yếu";
        }
    }
}
