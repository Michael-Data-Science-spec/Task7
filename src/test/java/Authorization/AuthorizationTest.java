package Authorization;

import db.DataBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    DataBase db;
    Authorization auth;

    @BeforeEach
    void SetUp() {
        auth = new Authorization();
        db = new DataBase();
    }

    @Test
    void authorize() {
        assertEquals(auth.authorize(db), true);
    }
}