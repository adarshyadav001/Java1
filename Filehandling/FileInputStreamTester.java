
import java.io.FileInputStream;

public class FileInputStreamTester {
 public static void main(String[] args) {
    FileInputStream fin;
     try {
         fin = new FileInputStream("test.txt");
         System.out.println("Size of file: " +fin.available());

         fin.close();
     } catch (Exception e) {

     }
     
     }
 }   

