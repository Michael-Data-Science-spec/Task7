package adapters;

import Facebook.FacebookUser;
import Twitter.TwitterUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TwitterAdapterTest {
    TwitterUser user;
    Date date;

    @BeforeEach
    void SetUp() {
        date = new Date();
        user = new TwitterUser("tuser@fb.com", "USA", date);
    }

    @Test
    void getEmail() {
        assertEquals(this.user.getEmail(), "tuser@fb.com");
    }

    @Test
    void getCountry() {
        assertEquals(this.user.getUserCountry(), "USA");
    }

    @Test
    void getDate() {
        long userTime = user.getLastActiveTime().getTime();
        long currentTime = date.getTime();
        assertEquals(userTime, currentTime);
    }
}