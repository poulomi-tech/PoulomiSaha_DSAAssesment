package com.gl.service;

import java.util.PriorityQueue;
import java.util.Collections;


public class PriorityQueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
      queue.add(12);
      queue.add(1);
      queue.add(2);
      queue.add(21);
      queue.add(121);
      
      while(!queue.isEmpty()) {
    	  System.out.println(queue.poll() + " ");
      }
	}

}
