package adapters;

import Facebook.FacebookUser;
import Twitter.TwitterUser;
import lombok.Setter;

import java.util.Date;

@Setter
public class TwitterAdapter implements User{
    private TwitterUser tUser;

    public TwitterAdapter(TwitterUser tUser) {
        this.tUser = tUser;
    }

    public String getCountry() {
        return tUser.getUserCountry();
    }

    public String getEmail() {
        return tUser.getEmail();
    }

    public Date getDate() {
        return tUser.getLastActiveTime();
    }
}
