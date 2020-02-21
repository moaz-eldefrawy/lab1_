import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    main test = new main();
    @Test
    void add() {
        assertEquals(test.add(1,2), 3);

        assertEquals(test.add(1,-2), -1);

        assertEquals(test.add(0,2), 2);
    }

    @Test
    void divide() {

        assertEquals(test.divide(1,1), 1);
        assertEquals(test.divide(10,5), 2);
        assertEquals(test.divide(1,2), 0.5);
        assertEquals(test.divide(1,3), (float)1/3);

        assertThrows(RuntimeException.class, () -> {
            test.divide(2, 0);
        });
    }
}