import java.util.Scanner;

class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int max, min;

        // Input first element
        arr[0] = scan.nextInt();
        max = min = arr[0];

        // Input remaining elements
        for (int i = 1; i < arr.length; i++) {
            arr[i] = scan.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scan.close();
    }
}
