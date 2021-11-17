package Twitter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TwitterUserTest {
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
    void getUserCountry() {
        assertEquals(this.user.getUserCountry(), "USA");
    }

    @Test
    void getLastActiveTime() {
        long userTime = user.getLastActiveTime().getTime();
        long currentTime = date.getTime();
        assertEquals(userTime, currentTime);
    }
}