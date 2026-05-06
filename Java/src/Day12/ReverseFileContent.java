package Day12;
import java.io.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            String reversed = content.reverse().toString();

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(reversed);
            writer.close();

            System.out.println("File content reversed successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

