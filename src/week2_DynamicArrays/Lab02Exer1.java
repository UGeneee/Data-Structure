package week2_DynamicArrays;



import week2_DynamicArrays.*;

public class Lab02Exer1 {

    public static void main(String[] args) {
        taskA();
        taskB();
    }

    public static void taskA() {
        String[] firstName = new String[5];

        firstName[0] = "Jennifer";
        firstName[1] = "Gemarie";
        firstName[2] = "Aly";
        firstName[3] = "Kaloy";
        firstName[4] = "Susan";

        for (int i = 0; i < firstName.length; i++) {
            System.out.println((i + 1) + ". " + firstName[i]);
        }
    }

    public static void taskB() {

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 5;
        numbers[2] = 30;
        numbers[3] = 25;
        numbers[4] = 60;

        int total = 0;

        System.out.print("\nAll numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

            total += numbers[i];
        }
        System.out.println("\nTotal: " + total);
    }
}
