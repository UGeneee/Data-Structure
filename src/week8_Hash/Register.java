
package week8_Hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Register {
    // ask for student id
    // ask student name
    // ask course

    // display all enrolled students
    // search for enrolled students using id
    // exit

    static HashMap<Integer, LinkedList<String>> reg = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    static int id = 0;
    static String name, course;
    

    public static void registration() {
        boolean loop = true;
        while (loop) {
            System.out.print("\nEnter Student ID (10 digit): ");
            id = sc.nextInt(); sc.nextLine();
            System.out.print("Enter Student Name: ");
            name = sc.nextLine();
            System.out.print("Enter Course: ");
            course = sc.nextLine();

            reg.put(id, new LinkedList<>());

            reg.get(id).add(name);
            reg.get(id).add(course);
            
            System.out.println("Student Registered Successfully.");

            System.out.print("Enroll another? Y/N\n: ");
            String rep = sc.nextLine().toUpperCase();
            loop = !rep.equals("N");
        }
    }
    
    public static void displayAllReg() {
        if (reg.isEmpty()) {
            System.out.println("No Registered Students.\n");
        }
        
        System.out.println("\nList of Students Registered: ");

        for(int stndtID : reg.keySet()) {    
            System.out.println("Student ID: " + stndtID);
            System.out.println("Student Name: " + reg.get(stndtID).get(0));
            System.out.println("Student Course: " + reg.get(stndtID).get(1) + "\n");
        }
    }
    
    public static void searchStudent() {
        System.out.println("\nSearch a student using ID");
        System.out.print("Enter Student ID: ");
        int search = sc.nextInt(); sc.nextLine();
        if(reg.containsKey(search)) {
            System.out.println("Student ID: " + reg.keySet().iterator().next());
            System.out.println("Student Name: " + reg.get(search).get(0));
            System.out.println("Student Course: " + reg.get(search).get(1) + "\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }
    

    public static void displayMenu() {
        int opt;
        do {
            System.out.println("Welcome to our system. What would you like to do?");
            System.out.print("""
                             1. Enroll Student
                             2. Display All Registered Students
                             3. Search for Student
                             4. Exit
                             : """);
            opt = sc.nextInt(); sc.nextLine();
            switch (opt) {
                case 1 -> registration();
                case 2 -> displayAllReg();
                case 3 -> searchStudent();
                case 4 -> System.out.println("Thanks for using the system.");
                default -> System.out.println("Please select only 1-4");
            }
        } while (opt != 4);
        
    }

    public static void main(String[] args) {
        displayMenu();
    }

}
