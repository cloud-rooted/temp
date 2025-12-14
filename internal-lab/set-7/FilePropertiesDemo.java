import java.io.File;
import java.text.SimpleDateFormat;

public class FilePropertiesDemo {
    public static void main(String[] args) {
        File f = new File("FilePropertiesDemo.java"); // replace with your file

        if (f.exists()) {
            System.out.println("File Name: " + f.getName());
            System.out.println("Absolute Path: " + f.getAbsolutePath());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File Size (bytes): " + f.length());
            System.out.println("Is File: " + f.isFile());
            System.out.println("Is Directory: " + f.isDirectory());

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Last Modified: " + sdf.format(f.lastModified()));
        } else {
            System.out.println("File does not exist.");
        }
    }
}
