import java.util.Scanner;

public class NumberListProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The numbers you entered are:");

        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
}