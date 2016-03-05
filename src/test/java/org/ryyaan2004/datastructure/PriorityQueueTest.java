package org.ryyaan2004.datastructure;

import org.junit.Test;
import org.ryyaan2004.datastructures.PriorityQueue;
import org.junit.Assert;

public class PriorityQueueTest {

	@Test
	public void insertsValues()
	{
		int[] arr = { 1,2,3,4 };
		PriorityQueue pq = new PriorityQueue(arr);
		int newKey = 5;
		pq.insert(newKey);
		Assert.assertEquals( "This didn't work"
				           , 5
				           , pq.getValue(5) );
	}
	
	@Test
	public void extractsMinValue()
	{
		int[] arr = { 1,2,3,4,5 };
		PriorityQueue pq = new PriorityQueue(arr);
		int min = pq.extractMin();
		Assert.assertEquals( 1, min );
		Assert.assertEquals( "The new minimum value (root) was not as expected, "
					 	   , 2
					 	   , pq.getValue(1) );
	}
	
	@Test
	public void decreasesKey()
	{
		int[] arr = { 1,2,3,4 };
		PriorityQueue pq = new PriorityQueue(arr);
		pq.decreaseKey(4, 1);
		Assert.assertEquals( "This doesn't work like you think"
					       , 1
					       , pq.getValue(2));
	}
}
