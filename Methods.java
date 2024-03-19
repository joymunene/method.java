QUESTION 1:
package java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
    }
}
QUESTION 2:
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for Java Programming:");
        int javaProgramming = scanner.nextInt();
        System.out.println("Enter marks for Networking:");
        int networking = scanner.nextInt();
        System.out.println("Enter marks for Maths:");
        int maths = scanner.nextInt();

        double average = (javaProgramming + networking + maths) / 3.0;

        System.out.println("Marks for Java Programming is: " + javaProgramming);
        System.out.println("Marks for Networking is: " + networking);
        System.out.println("Marks for Maths is: " + maths);
        System.out.println("The average is: " + average);
    }
}
QUESTION 3:
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
    }
}
QUESTION 4:
public class TriangleArea {
    private double base;
    private double height;

    public TriangleArea() {
        this.base = 0;
        this.height = 0;
    }

    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        this.base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        this.height = scanner.nextDouble();
    }

    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + calculateArea());
    }

    public static void main(String[] args) {
        TriangleArea triangle = new TriangleArea();
        triangle.inputValues();
        triangle.displayArea();
    }
}
