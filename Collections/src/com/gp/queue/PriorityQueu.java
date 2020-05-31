package com.gp.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new PriorityQueue<>();
		System.out.println(q.peek());
		System.out.println(q.element());//comment
		

	}

}
/*Exception in thread "main" java.util.NoSuchElementException
at java.util.AbstractQueue.element(Unknown Source)
at com.gp.queue.PriorityQueu.main(PriorityQueu.java:12)
null*/
