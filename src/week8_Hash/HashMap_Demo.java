package week8_Hash;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Demo {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String name, age, home, crush, hobby;

        for (int i = 0; i < 2; i++) {
            System.out.print("Whats your name? \n: ");
            name = sc.nextLine();
            System.out.println("\nHello " + name + " nice meeting you!");
            System.out.print("What's your age? ");
            age = sc.nextLine();
            System.out.print("Where do you live? ");
            home = sc.nextLine();
            System.out.print("Name of your crush? ");
            crush = sc.nextLine();
            System.out.print("What is your hobby? ");
            hobby = sc.nextLine();

            map.put(1, name);
            map.put(2, age);
            map.put(3, home);
            map.put(4, crush);
            map.put(5, hobby);

            System.out.println("The users name is: " + map.get(1) + 
                    " \nand he's " + map.get(2) + " years old living in " 
                    + map.get(3) + ". \nHe has a crush on " + map.get(4) + 
                    " and his hobby is " + map.get(5) + ".\n");
           
        }
    }
}
