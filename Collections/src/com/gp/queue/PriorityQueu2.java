package com.gp.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new PriorityQueue<>();
		System.out.println(q.peek());
		//System.out.println(q.element());//comment to avoid no such element exception
		
		for(int i=20;i<=30;i++){
			q.offer(i);
		}
		System.out.println(q);
		
		System.out.println(q.poll());//removes head otherwise retun null
		
		/*null
		[20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
		20*/
		
		System.out.println(q.remove());//similar to poll..but throw nosuchelement exc if queue empty
		
		System.out.println(q);//removes 21..priorityqueue guarantee order first time only ..if remove it will not guarantee order any more..use tree set  to retain order after removing elements
		
	/*	null
		[20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
		20
		21
		[22, 23, 25, 27, 24, 29, 26, 30, 28]
*/


	}

}

/*null
[20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]*/

/*Exception in thread "main" java.util.NoSuchElementException
at java.util.AbstractQueue.element(Unknown Source)
at com.gp.queue.PriorityQueu.main(PriorityQueu.java:12)
null*/
