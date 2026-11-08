package week7_PriorityQueue;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt((Task t) -> t.priority).reversed());

        try {
            System.out.print("Enter number of tasks: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {

                System.out.print("Enter description for Task " + (i + 1) + ": ");
                String desc = sc.nextLine();
                if (desc.isBlank()) {
                    System.out.println("Please enter a description for the task.");
                    return;
                }
                System.out.print("Enter priority (1-10) for Task " + (i + 1) + ": ");
                int prio = sc.nextInt();
                sc.nextLine();
                if (prio > 10) {
                    System.out.println("Enter only 1 - 10 for priority.");
                    return;
                }

                taskQueue.add(new Task(desc, prio));
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a whole number.");
            return;
        }

        System.out.println("\nNext task: " + taskQueue.peek() + "\n");

        System.out.println("Processing tasks in order of priority: ");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll().toString());
        }
    }
}
