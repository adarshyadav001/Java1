import java.util.Scanner;

class KeyIn {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        a = scan.nextInt();

        System.out.println("Enter second number:");
        b = scan.nextInt();

        c = a + b;

        System.out.println("Sum = " + c);

        scan.close();
    }
}
