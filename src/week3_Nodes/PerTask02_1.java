package week3_Nodes;

class Node {

    String songTitle;
    Node next;

    Node(String title) {
        this.songTitle = title;
        this.next = null;
    }

}

public class PerTask02_1 {

    private static Node head, tail;

    public static void main(String[] args) {
        head = new Node("Song A");
        head.next = new Node("Song B");
        head.next.next = new Node("Song C");
        
        tail = head.next.next;

        System.out.println("Playlist Before Inserting Song D: ");
        show(head);

        System.out.println("\nPlaylist After inserting Song D:");
        insert("Song D");
        show(head);

        System.out.println("\nPlaylist After Searching and then Deleting Song B:");
        delete("Song A");
        show(head);
    }

    public static void show(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.songTitle + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void insert(String songTitle) {
        Node newNode = new Node(songTitle);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void delete(String songTitle) {
        if (head == null) {
            return;
        } else if (head.songTitle.equals(songTitle)) {
            head = head.next;
            return;
        } 
        Node current = head;
        while (current.next != null) {
            if (current.next.songTitle.equals(songTitle)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}
