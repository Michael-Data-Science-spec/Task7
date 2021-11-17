package Facebook;

import lombok.Getter;
import lombok.AllArgsConstructor;

import java.util.Date;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String email;
    public String UserCountry;
    private Date userActiveTime;
}
