import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testValidInput() {
        String[] args = {"15"};
        Dec2Hex.main(args);
        // Check expected output manually or by capturing system output in advanced cases
    }

    @Test
    public void testNoInput() {
        String[] args = {};
        Dec2Hex.main(args);
        // Expect: Error: No input argument provided.
    }

    @Test
    public void testNonIntegerInput() {
        String[] args = {"abc"};
        Dec2Hex.main(args);
        // Expect: Error: Input argument is not a valid integer.
    }
}
