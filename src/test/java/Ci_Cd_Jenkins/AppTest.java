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
        assertEquals(10, app.add(5, 2), "Intentional failure for demo");
    }
    @Test
    void testAddition2() {
        App app = new App();
        assertEquals(20, app.add(15, 5), "Additon of 15 and 5");
    }
}
