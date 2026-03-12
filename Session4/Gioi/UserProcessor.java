package Session4.Gioi;

public class UserProcessor {
    public String proccessEmail(String email){
        if(email == null || !email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException("Email không đúng định dạng");
        }

        return email.toLowerCase();
    }
}
