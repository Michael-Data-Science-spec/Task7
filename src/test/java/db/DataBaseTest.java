package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    DataBase db;

    @BeforeEach
    void SetUp() {
        db = new DataBase();
    }

    @Test
    void getUserData() {
        assertEquals(db.getUserData(), "hello");
    }

    @Test
    void getStatisticalData() {
        assertEquals(db.getStatisticalData(), "hello2");
    }
}