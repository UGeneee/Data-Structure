package week8_Hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class HashChaining {

    public static void main(String[] args) {
        HashMap<Integer, LinkedList<String>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put(1, new LinkedList<>());
        
        map.get(1).add("Meow");
        map.get(1).add("Rawr");
        map.get(1).add("Arf");
        
        System.out.println(map);
        
        int a = 2 % 5;
        System.out.println(a);
        
//        int id = 0;
//
//        System.out.println("Type a number 1-10");
//        id = sc.nextInt();
//        sc.nextLine();
//
//
//        for (int i = 0; i < id; i++) {
//            map.put(i + 1, new LinkedList<>());
//        }
//
//        System.out.println(map);

    }
}
