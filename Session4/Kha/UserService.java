package Session4.Kha;

public class UserService {
     public static boolean checkRegistrationAge(int age){
         if(age < 0){
             throw new IllegalArgumentException("Tuổi không được âm");
         }

        if(age < 18){
            return false;
        }

        return true;
     }
}
