
import adapters.User;

import java.util.Date;
import java.util.Objects;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        long userLastActiveTime = user.getDate().getTime();
        Date date = new Date();
        long currentTime = date.getTime();
        if (userLastActiveTime - currentTime < 3600000 && Objects.equals(user.getCountry(), country)) {
            System.out.println("message sent");
            return true;
        }
        else if (!Objects.equals(user.getCountry(), country)) {
            System.out.println("User is in another country");
            return false;
        }
        else {
            System.out.println("User has not been active");
            return false;
        }
    }
}