package week09_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class StudentCourses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> courses = new HashSet<>();

        System.out.println("=== HashSet ===");
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            String course = sc.nextLine();

            courses.add(course);
        }

        System.out.println("Courses: " + courses);

        System.out.print("\nSearch course: ");
        String courseSearch = sc.nextLine();
        if (courses.contains(courseSearch)) {
            System.out.println(courseSearch + " is available.");
        } else {
            System.out.println("Course does not exist.");
        }

        System.out.print("\nRemove course: ");
        String courseRemove = sc.nextLine();
        System.out.println("Removing: " + courseRemove);
        courses.remove(courseRemove);
        System.out.println("Courses after removal: " + courses);

        System.out.println("=== HashMap ===");
        HashMap<String, Integer> grades = new HashMap<>();

        System.out.println("Enter 3 student name and their grades.");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student " + (i + 1) + "name: ");
            String stuName = sc.nextLine();
            System.out.print("Enter " + stuName + "'s grade: ");
            int stuGrade = sc.nextInt();
            sc.nextLine();

            grades.put(stuName, stuGrade);
        }

        System.out.println("Grades: " + grades);

        System.out.print("\nSearch student: ");
        String name = sc.nextLine();

        if (grades.containsKey(name)) {
            System.out.println(name + "'s grade: " + grades.get(name));
        } else {
            System.out.println(name + " was not found.");
        }

        System.out.print("\nUpdate student: ");
        String name2 = sc.nextLine();

        if (grades.containsKey(name2)) {
            System.out.print("New grade: ");
            int nGrade = sc.nextInt(); sc.nextLine();
           
            grades.put(name2, nGrade);
        } else {
            System.out.println(name2 + " was not found.");
        }

        System.out.println("Grades after update: " + grades);

        System.out.print("Remove student: ");
        String removeName = sc.nextLine();
        grades.remove(removeName);

        System.out.println("Grades after removal: " + grades);

    }
}
