import java.io.*;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("RunnableDemo.java")); // replace with your file
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
