import java.util.Scanner;

class Dec2Hex {
    public static int Arg1;

    public static void main(String args[]) {
        try {
            // Check if an argument is provided
            if (args.length == 0) {
                throw new IllegalArgumentException("Error: No input argument provided.");
            }

            // Parse the input argument as an integer
            Arg1 = Integer.parseInt(args[0]);

            // Check if the input is a non-negative integer
            if (Arg1 < 0) {
                throw new IllegalArgumentException("Error: Input argument should be a non-negative integer.");
            }

            // Start converting to hexadecimal
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num;
            num = Arg1;
            StringBuilder hexadecimal = new StringBuilder();

            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal.insert(0, ch[rem]);
                num = num / 16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal.toString());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No input argument provided.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Input argument is not a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
