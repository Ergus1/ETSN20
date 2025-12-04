import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//hehh

public class search {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Please provide the file path as a command-line argument.");
            return;
        }

        String filePath = args[1];
        String searchTerm = args[0];

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(searchTerm)) {
                    System.out.println(line);
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
