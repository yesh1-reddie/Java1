package Day12;
import java.io.*;
import java.util.*;

public class EvenNumbersFromFile {
    public static void main(String[] args) {
        String fileName = "numbers.txt";

        try {
            // Step 1: Create file with numbers 0–10
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i <= 10; i++) {
                writer.write(i + (i < 10 ? "," : ""));
            }
            writer.close();

            // Step 2: Read file using Scanner
            Scanner sc = new Scanner(new File(fileName));
            sc.useDelimiter(",");

            System.out.println("Even Numbers:");
            while (sc.hasNext()) {
                int num = Integer.parseInt(sc.next().trim());
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
