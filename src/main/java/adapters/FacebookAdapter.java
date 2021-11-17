package adapters;

import Facebook.FacebookUser;
import lombok.Setter;

import java.util.Date;

@Setter
public class FacebookAdapter implements User{
    private FacebookUser fbUser;

    public FacebookAdapter(FacebookUser fbUser) {
        this.fbUser = fbUser;
    }

    public String getCountry() {
        return fbUser.getUserCountry();
    }

    public String getEmail() {
        return fbUser.getEmail();
    }

    public Date getDate() {
        return fbUser.getUserActiveTime();
    }
}
