import java.util.Scanner;

class MatrixAddition {

  
    static void readMatrix(int[][] mat, Scanner sc) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    
    static void addMatrix(int[][] a, int[][] b, int[][] sum) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }

   
    static void printMatrix(int[][] mat) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];

        System.out.println("Enter elements of Matrix A (4x4):");
        readMatrix(A, sc);

        System.out.println("Enter elements of Matrix B (4x4):");
        readMatrix(B, sc);

        addMatrix(A, B, C);

        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        System.out.println("\nSum Matrix (A + B):");
        printMatrix(C);

        sc.close();
    }
}
