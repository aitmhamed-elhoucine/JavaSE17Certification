package ch9.collectionsAndGenerics;

import java.util.*;

public class QueueInterfaceTest {

	public static void main(String[] args) {
		//FIFO Queue
		Queue<Integer> fifoQueue = new LinkedList<>();
		
		//System.out.println("element() method : "+fifoQueue.element());
		System.out.println("peek() method : "+fifoQueue.peek());
		
			//Adding elements to the Queue (always to back)
		for(int i=0; i<10; i++) {
			fifoQueue.add(i);
			fifoQueue.offer(i+50);
		}
		System.out.println(fifoQueue);
		
			//Getting Elements (always from front)
		System.out.println("element() method : "+fifoQueue.element());
		System.out.println("peek() method : "+fifoQueue.peek());
	
			//Removing Elements (always from front)
		System.out.println("remove() method : "+fifoQueue.remove());
		System.out.println("poll() method : "+fifoQueue.poll());
		
			//Updating Elements
		System.out.println(fifoQueue);
		
		
		//LIFO Queue Stack
		Deque<Integer> stack = new ArrayDeque<>();
		   //Adding elements
        stack.push(12);
		stack.push(4);
		System.out.println(stack);
		
		    //Gettting elements
		System.out.println("stack peek(): "+stack.peek());
		   //Removing elements
		System.out.println("stack poll(): "+stack.poll());
		   
		//Double End Queue (Deque)
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=0; i<10; i++) {
			deque.add(i);
			deque.addFirst(i+50);
		}
		System.out.println(deque);
		
			//Getting Elements 
		System.out.println("getFirst() method : "+deque.getFirst());
		System.out.println("peekFirst() method : "+deque.peekFirst());
		System.out.println("getLast() method : "+deque.getLast());
		System.out.println("peekLast() method : "+deque.peekLast());
		
			//Removing Elements 
		System.out.println("removeFirst() method : "+deque.removeFirst());
		System.out.println("pollFirst() method : "+deque.pollFirst());
		System.out.println("pollLast() method : "+deque.pollLast());
		System.out.println("peekLast() method : "+deque.peekLast());
	}

}
