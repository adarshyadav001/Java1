import java.util.Scanner;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

class Student {
    private int rollNumber;
    private double percentage;

    public Student(int rollNumber, double percentage) throws InvalidDataException {
        if (rollNumber < 0) {
            throw new InvalidDataException("Roll number cannot be negative.");
        }

        if (percentage < 0 || percentage > 100) {
            throw new InvalidDataException("Percentage must be between 0 and 100.");
        }

        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Enter Percentage: ");
            double percent = sc.nextDouble();

            Student s = new Student(roll, percent);
            s.display();

        } catch (InvalidDataException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
