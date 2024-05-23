package wk1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIOReview {
    public static void main(String[] args) {
        // Create Path
        Path path = Path.of("data/example.docx");
        // Create OutputStream using try-with-resources
        // Create DataOutputStream
        try (OutputStream os = Files.newOutputStream(path);
             DataOutputStream out = new DataOutputStream(os)) {
            out.writeChar('H');
            out.writeChar('i');
            out.writeDouble(Math.PI);
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
        // Write primitive data
    }
}
