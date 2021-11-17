
import db.DataBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportBuilderTest {
    DataBase db;
    ReportBuilder br;

    @BeforeEach
    void setUp() {
        db = new DataBase();
        br = new ReportBuilder(db);
    }

    @Test
    void ReportBuilder() {
        assertEquals(this.br.getDb().getUserData(), "hello");
        assertEquals(this.br.getDb().getStatisticalData(), "hello2");
    }
}