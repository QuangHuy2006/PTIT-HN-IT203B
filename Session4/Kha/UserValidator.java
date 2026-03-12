package Session4.Kha;

public class UserValidator {
    public static boolean isValidUsername(String username){
        if(username.length() < 5){
            return false;
        }

        if(username.contains(" ")){
            return false;
        }

        return true;
    }
}
