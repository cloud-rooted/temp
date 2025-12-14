import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("source.txt");
        FileOutputStream fout = new FileOutputStream("destination.txt");

        int ch;
        while ((ch = fin.read()) != -1) {
            fout.write(ch);
        }

        fin.close();
        fout.close();

        System.out.println("File copied successfully");
    }
}
