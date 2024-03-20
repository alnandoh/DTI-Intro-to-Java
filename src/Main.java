
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a task to perform (1-5):");
        System.out.println("1. Find area of rectangle");
        System.out.println("2. Find diameter, circumference, and area of a circle");
        System.out.println("3. Find angles of triangle if 2 angles are given");
        System.out.println("4. Find difference between dates in days");
        System.out.println("5. Print your name initial in uppercase");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                findRectangleArea(scanner);
                break;
            case 2:
                findCircleProperties(scanner);
                break;
            case 3:
                findThirdAngleOfTriangle(scanner);
                break;
            case 4:
                findDateDifference(scanner);
                break;
            case 5:
                printNameInitial(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 5.");
        }

        scanner.close();
    }

    // Function to find area of rectangle
    private static void findRectangleArea(Scanner scanner) {
        System.out.print("Enter length and width of the rectangle:");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int rectangleArea = length * width;
        System.out.print("Area of the rectangle: " + rectangleArea);
        scanner.close();
    }

    // Function to find diameter, circumference, and area of a circle
    private static void findCircleProperties(Scanner scanner) {
        System.out.print("Enter radius of the circle:");
        int radius = scanner.nextInt();
        double circleDiameter = 2 * radius;
        double circleCircumference = 2 * Math.PI * radius;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Diameter of the circle: " + circleDiameter);
        System.out.println("Circumference of the circle: " + circleCircumference);
        System.out.println("Area of the circle: " + circleArea);
        scanner.close();
    }

    // Function to find angles of triangle if 2 angles are given
    private static void findThirdAngleOfTriangle(Scanner scanner) {
        System.out.print("Enter two angles of the triangle:");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = 180 - angle1 - angle2;
        System.out.print("Third angle of the triangle: " + angle3);
        scanner.close();
    }

    // Function to find difference between dates in days
    private static void findDateDifference(Scanner scanner) {
        System.out.println("Enter two dates (dd-mm-yyyy format):");
        String dateInput1 = scanner.next();
        String dateInput2 = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(dateInput1, formatter);
        LocalDate date2 = LocalDate.parse(dateInput2, formatter);

        long daysDifference = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Difference between dates in days: " + Math.abs(daysDifference));
        scanner.close();
    }

    // Function to print your name initial in uppercase
    private static void printNameInitial(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter your full name:");
        String fullName = scanner.nextLine();
        String[] name = fullName.split(" ");
        char[] initials= new char[name.length];
        for (int i = 0; i < name.length; i++) {
            char first = name[i].charAt(0);
            initials[i]=first;
        }
        System.out.print("Initials of your name: " + new String(initials).toUpperCase());
        scanner.close();
    }

//    chatGPT answer 5
//    StringBuilder initials = new StringBuilder();
//    String[] words = fullName.split("\\s+");
//        for (String word : words) {
//        if (!word.isEmpty()) {
//            initials.append(Character.toUpperCase(word.charAt(0)));
//        }
//    }
//
//    // Print the initials
//        System.out.println("Initials of your name: " + initials);
//        scanner.close();
}