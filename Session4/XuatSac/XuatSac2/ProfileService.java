package XuatSac.XuatSac2;

import XuatSac.XuatSac2.User;

import java.time.LocalDate;
import java.util.List;

public class ProfileService {

    public User updateProfile(User existingUser,
                              UserProfile newProfile,
                              List<User> allUsers) {


        if (newProfile.getBirthDate().isAfter(LocalDate.now())) {
            return null;
        }

        for (User user : allUsers) {

            if (user == existingUser) {
                continue;
            }

            if (user.getEmail().equals(newProfile.getEmail())) {
                return null;
            }
        }

        existingUser.setEmail(newProfile.getEmail());
        existingUser.setBirthDate(newProfile.getBirthDate());
        existingUser.setName(newProfile.getName());

        return existingUser;
    }
}
