import Facebook.FacebookUser;
import Twitter.TwitterUser;
import adapters.FacebookAdapter;
import adapters.TwitterAdapter;
import adapters.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender sender;
    FacebookUser fbUser;
    TwitterUser twUser;
    FacebookAdapter user1;
    TwitterAdapter user2;
    Date date;

    @BeforeEach
    void SetUp() {
        sender = new MessageSender();
        date = new Date();
        fbUser = new FacebookUser("fbuser@fb.com", "USA", date);
        twUser = new TwitterUser("tuser@fb.com", "UK", date);
        user1 = new FacebookAdapter(fbUser);
        user2 = new TwitterAdapter(twUser);
    }

    @Test
    void send() {
        assertEquals(this.sender.send("some message to fuser", this.user1, "USA"), true);
        assertEquals(this.sender.send("some message to tuser", this.user2, "USA"), false);
    }
}