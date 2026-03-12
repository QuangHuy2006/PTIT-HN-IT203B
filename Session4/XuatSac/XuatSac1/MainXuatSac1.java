package Session4.XuatSac.XuatSac1;

public class MainXuatSac1 {
    public static boolean canPerformAction(User user, Action action){
        String roleUser = user.getRole();
        String actionUser = user.getAction();

        String actionActual = action.getAction();

        if(roleUser.equals("ADMIN")){
            return true;
        } else if (roleUser.equals("MODERATOR")) {
            if(actionUser.equals("DELETE_USER")){
                return false;
            }
            return true;
        }else {
            if(actionUser.equals("VIEW_PROFILE")){
                return true;
            }
            return false;
        }
    }
}
