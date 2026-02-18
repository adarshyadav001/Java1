import java.util.Scanner;

class Tester1 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter total number:");
            int count = scan.nextInt();

            int[] num = {2, 4, 5, 6, 10};
            int sum = 0;

            for (int i = 0; i < count; i++) {
                sum = sum + num[i];
                System.out.println("Sum: " + sum);
            }

            float avg = (float) sum / count;   
            System.out.println("Average: " + avg);

        } 
        catch (ArithmeticException ex) {
            System.out.println("Count should not be zero");
        } 
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid count value (greater than array size)");
        } 
        catch (Exception ex) {
            System.out.println("Some unexpected error occurred");
        }
    }
}
