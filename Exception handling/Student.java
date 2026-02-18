
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int marks,roll;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter roll number:");
        roll = scan.nextInt();
        System.out.println("Enter percentge of marks: ");
        marks = scan.nextInt();
        System.out.println("Roll :" +roll);
        System.out.println("Percentage of Marks : " +marks);
    }
    
}
