package Ci_Cd_Jenkins;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddition() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testStringContainsWord() {
        App app = new App();
        assertTrue(app.containsWord("Hello Jenkins CI", "Jenkins"),
                   "String should contain 'Jenkins'");
    }

    @Test
    void testFailureExample() {
        App app = new App();
        assertEquals(10, app.add(5, 5), "Intentional failure for demo");
    }
}
