package adapters;

import Facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FacebookAdapterTest {
    FacebookUser user;
    Date date;

    @BeforeEach
    void SetUp() {
        date = new Date();
        user = new FacebookUser("fbuser@fb.com", "USA", date);
    }

    @Test
    void getEmail() {
        assertEquals(this.user.getEmail(), "fbuser@fb.com");
    }

    @Test
    void getCountry() {
        assertEquals(this.user.getUserCountry(), "USA");
    }

    @Test
    void getDate() {
        long userTime = user.getUserActiveTime().getTime();
        long currentTime = date.getTime();
        assertEquals(userTime, currentTime);
    }
}