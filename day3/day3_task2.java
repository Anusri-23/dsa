package dsa;

public class day3_task2 {
	public class Task2 {
	    Node head;

	    class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }

	    public Task2() {
	        head = null;
	    }

	    public void insertAtBegin(int val) {
	        Node newNode = new Node(val);
	        newNode.next = head;
	        head = newNode;
	    }

	    public void insertAtAnyPos(int pos, int val) {
	        if (pos == 1) {
	            insertAtBegin(val);
	            return;
	        }
	        Node newNode = new Node(val);
	        Node temp = head;
	        for (int i = 1; i < pos - 1; i++) {
	            temp = temp.next;
	        }
	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    public static void main(String[] args) {
	    	day3_task2 list = new day3_task2();
	        list.insertAtBegin(10);
	        list.insertAtBegin(20);
	        list.insertAtBegin(30);
	        list.insertAtAnyPos(2, 25);
	    }
	}

	public void insertAtBegin(int i) {
		
		
	}

	public void insertAtAnyPos(int i, int j) {
		
		
	}

}
