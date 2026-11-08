package week2_DynamicArrays;



import week2_DynamicArrays.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab02Exer2 {
    // Author Ephraim E. Bonifacio
    // Author Ephraim E. Bonifacio
    // Author Ephraim E. Bonifacio
    // Author Ephraim E. Bonifacio
    // Author Ephraim E. Bonifacio
    // Author Ephraim E. Bonifacio

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            try {
                ArrayList<Integer> negativeNumbers = new ArrayList<>();
                ArrayList<Integer> smallNumbers = new ArrayList<>();
                ArrayList<Integer> mediumNumbers = new ArrayList<>();
                ArrayList<Integer> largeNumbers = new ArrayList<>();
                int numbers;

                System.out.print("Enter amount of iterations: ");
                numbers = sc.nextInt();

                System.out.println("Number of iterations: " + numbers);

                for (int i = 0; i < numbers; i++) {
                    while (true) {
                        try {
                            System.out.print("Enter number " + (1 + i) + ": ");
                            int num = sc.nextInt();

                            if (num < 0) {
                                negativeNumbers.add(num);
                            } else if (num <= 50) {
                                smallNumbers.add(num);
                            } else if (num >= 51 && num <= 100) {
                                mediumNumbers.add(num);
                            } else {
                                largeNumbers.add(num);
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                            sc.next();
                        }
                    }

                }
                if (!negativeNumbers.isEmpty()) {
                    System.out.println("Numbers that are negatives: " + negativeNumbers);
                } else {
                    System.out.println("No negative numbers found.");
                }
                if (!smallNumbers.isEmpty()) {
                    System.out.println("Numbers that are between 0 - 50: " + smallNumbers);
                } else {
                    System.out.println("No numbers between 0 - 50 was found.");
                }
                if (!mediumNumbers.isEmpty()) {
                    System.out.println("Numbers that are between 51 - 100: " + mediumNumbers);
                } else {
                    System.out.println("No numbers between 51 - 100 was found.");
                }
                if (!largeNumbers.isEmpty()) {
                    System.out.println("Numbers that are greater than 100: " + largeNumbers);
                } else {
                    System.out.println("No numbers greater than 100 was found.");
                }

                System.out.println("Again? Y/N");
                String input = sc.next().toUpperCase();
                if (input.equals("N")) {
                    repeat = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a number.");
                sc.next();
            }
        }

    }

}
