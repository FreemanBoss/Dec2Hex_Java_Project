import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    @Test
    public void testValidInput() {
        String[] args = {"15"};
        Dec2Hex.main(args); // Call the main method with a valid integer argument
        // We can add assertions here to check if the output is as expected
        // For instance, we can redirect the output stream and verify the printed message
    }

    @Test
    public void testNoInput() {
        String[] args = {};
        Dec2Hex.main(args);
        // Expect: Error: No input argument provided.
        // We can capture the output and assert the error message
    }

    @Test
    public void testNonIntegerInput() {
        String[] args = {"abc"};
        Dec2Hex.main(args);
        // Expect: Error: Input argument is not a valid integer.
        // We can capture the output and assert the error message
    }

    @Test
    public void testNegativeInput() {
        String[] args = {"-10"};
        Dec2Hex.main(args);
        // Expect: Error: Input argument should be a non-negative integer.
        // We can capture the output and assert the error message
    }

    @Test
    public void testZeroInput() {
        String[] args = {"0"};
        Dec2Hex.main(args);
        // Expect: Hexadecimal representation is: 0
        // We can capture the output and assert the hexadecimal conversion
    }
}
