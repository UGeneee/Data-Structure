package week6_Heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HeapLab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of incidents: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] ids = new int[n];

        String[] locations = new String[ids.length];
        int[] severities = new int[ids.length];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < ids.length; i++) {
            ids[i] = 101 + i;
            System.out.print(ids[i] + " - " + "Enter Location: ");
            locations[i] = sc.nextLine();
            System.out.print(ids[i] + " - " + "Enter severity (1-10): ");
            severities[i] = sc.nextInt();
            sc.nextLine();

            minHeap.add(severities[i]);
            maxHeap.add(severities[i]);
        }

        System.out.println("\nDispatch Order (Max-Heap)");
        while (!maxHeap.isEmpty()) {
            int sev = maxHeap.poll();
            for (int i = 0; i < n; i++) {
                if (severities[i] == sev) {
                    System.out.println(ids[i] + " - " + locations[i] + " - " + "(Severity: " + severities[i] + ")");
                    break;
                }
            }
        }

        System.out.println("\nBacklog Monitoring (Min-Heap)");
        while (!minHeap.isEmpty()) {
            int sev = minHeap.poll();
            for (int i = 0; i < n; i++) {
                if (severities[i] == sev) {
                    System.out.println(ids[i] + " - " + locations[i] + " - " + "(Severity: " + severities[i] + ")");
                    break;
                }
            }
        }
    }
}
