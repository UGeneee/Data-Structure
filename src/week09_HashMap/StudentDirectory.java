package week09_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class StudentDirectory {
    
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, String> studentList = new HashMap<>();

    public static void search() {
        System.out.print("\nEnter student ID: ");
        String searchNum = sc.nextLine();
        
        if (studentList.containsKey(searchNum)) {
            System.out.println("Student name: " + studentList.get(searchNum) + "\n");
        } else {
            System.out.println("Student does not exist.\n");
        }
    }
    
    public static void remove() {
        String removeNum;
        System.out.print("Enter student number to remove: ");
        removeNum = sc.nextLine();
        
        if(studentList.containsKey(removeNum)) {
            System.out.println("Student: " + studentList.get(removeNum) + " will be removed from the system.");
            studentList.remove(removeNum);
        } else {
            System.out.println("Student does not exist.\n");
        }
    }
    
    public static void addUp() {
        String newNum, newName; 
        System.out.print("Enter student number to add or update: ");
        newNum = sc.nextLine();
        System.out.print("Enter student name: ");
        newName = sc.nextLine();
        
        if (studentList.containsKey(newNum)) {
            System.out.println("Student name: " + studentList.get(newNum) + "\n");
        } else {
            System.out.println("No existing record found. Added new entry.\n");
            studentList.put(newNum, newName);
        }
    }

    public static void dispMenu() {
        int choice;
        do {
            System.out.println("Welcome, what would you like to do?");
            System.out.println("""
                           1. Search Student
                           2. Remove Student
                           3. Add/Update Student
                           4. Exit
                           """);
            System.out.print(": ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 ->search();
                case 2 -> remove();
                case 3 -> addUp();
                case 4 -> {
                    System.out.println("Exiting...");
                    break;
                }
                default ->
                    System.out.println("Please enter a valid option.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        int n;
        String studNum, studName;

        System.out.print("Enter how many student: ");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student number: ");
            studNum = sc.nextLine();
            System.out.print("Enter student name: ");
            studName = sc.nextLine();

            studentList.put(studNum, studName);
        }

        System.out.println("\nStudent Directory: " + studentList + "\n");

        dispMenu();

    }

}
