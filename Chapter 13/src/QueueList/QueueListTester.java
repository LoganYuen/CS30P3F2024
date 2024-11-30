package QueueList;
/*
Program: QueueListTester.java          Date: December 3, 2024


Purpose: Create a QueueListTester application that tests the Queue3 class.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class QueueListTester 
{
	public static void main(String[] args) 
	{
		//Create Queue2 object
		QueueList ql = new QueueList();
		
		
		//Test enqueue method
		System.out.println("Adding \"keyboard\", \"mouse\", \"monitor\", \"speakers\", and \"mousepad\" to queue.\n");
		ql.enqueue("keyboard");
		ql.enqueue("mouse");
		ql.enqueue("monitor");
		ql.enqueue("speakers");
		ql.enqueue("mousepad");
		
		
		//Test front and size methods
		System.out.println("Front of queue: " + ql.front());
		System.out.println("Items in queue: " + ql.size());
		
		
		//Test dequeue and for changes in the size method
		System.out.println("\nDequeueing front item: " + ql.dequeue());
		System.out.println("Items in queue: " + ql.size());
		
		
		//Test enqueue again
		System.out.println("\nAdding \"headphones\" to queue.");
		ql.enqueue("headphones");
		System.out.println("Front of queue: " + ql.front());
		System.out.println("Items in queue: " + ql.size());
		
		
		//Test dequeue again
		System.out.println("\nDequeueing front item: " + ql.dequeue());
		
		
		//Test enqueue again
		System.out.println("\nAdding \"desk\" to queue.");
		ql.enqueue("desk");
		System.out.println("Front of queue: " + ql.front());
		System.out.println("Items in queue: " + ql.size());
		
		
		//Test multiple dequeues
		System.out.println("\nDequeueing front item: " + ql.dequeue());
		System.out.println("Dequeueing front item: " + ql.dequeue());
		System.out.println("Dequeueing front item: " + ql.dequeue());
		System.out.println("Dequeueing front item: " + ql.dequeue());
		System.out.println("Front of queue: " + ql.front());
		System.out.println("Items in queue: " + ql.size());
		
		
		//Test dequeue again
		System.out.println("\nDequeueing front item: " + ql.dequeue());
		System.out.println("Items in queue: " + ql.size());
	}
}
/* Screen Dump
Test Case 1:
Adding "red", "orange", and "yellow" to queue.

Front of queue: red
Items in queue: 3

Dequeueing front item: red
Items in queue: 2

Adding "purple" to queue.
Front of queue: orange
Items in queue: 3

Dequeueing front item: orange

Adding "blue" to queue.
Front of queue: yellow
Items in queue: 3

Dequeueing front item: yellow
Dequeueing front item: purple
Front of queue: blue
Items in queue: 1

Dequeueing front item: blue
Items in queue: 0





Test Case 2:
Adding "keyboard", "mouse", "monitor", "speakers", and "mousepad" to queue.

Front of queue: keyboard
Items in queue: 5

Dequeueing front item: keyboard
Items in queue: 4

Adding "headphones" to queue.
Front of queue: mouse
Items in queue: 5

Dequeueing front item: mouse

Adding "desk" to queue.
Front of queue: monitor
Items in queue: 5

Dequeueing front item: monitor
Dequeueing front item: speakers
Dequeueing front item: mousepad
Dequeueing front item: headphones
Front of queue: desk
Items in queue: 1

Dequeueing front item: desk
Items in queue: 0
*/