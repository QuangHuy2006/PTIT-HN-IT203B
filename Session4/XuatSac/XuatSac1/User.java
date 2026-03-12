package Session4.XuatSac.XuatSac1;

public class User {
    private String role;
    private String action;

    public User(String role, String action) {
        this.role = role;
        this.action = action;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


}
