package Twitter;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String email;
    public String UserCountry;
    private Date lastActiveTime;
}
