import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testValidInput() {
        String[] args = {"15"};
        Dec2Hex.main(args);
        // Check if the output matches the expected hexadecimal representation
        // Example: "Hexadecimal representation is: F"
        // You might want to capture System.out output and assert it.
    }

    @Test
    public void testNoInput() {
        String[] args = {};
        Dec2Hex.main(args);
        // Expect: Error: No input argument provided.
        // Capture System.out output and assert it.
    }

    @Test
    public void testNonIntegerInput() {
        String[] args = {"abc"};
        Dec2Hex.main(args);
        // Expect: Error: Input argument is not a valid integer.
        // Capture System.out output and assert it.
    }

    @Test
    public void testNegativeInput() {
        String[] args = {"-10"};
        Dec2Hex.main(args);
        // Expect: Error: Input argument should be a non-negative integer.
        // Capture System.out output and assert it.
    }

    @Test
    public void testZeroInput() {
        String[] args = {"0"};
        Dec2Hex.main(args);
        // Expect: Hexadecimal representation is: 0
        // Capture System.out output and assert it.
    }
}
