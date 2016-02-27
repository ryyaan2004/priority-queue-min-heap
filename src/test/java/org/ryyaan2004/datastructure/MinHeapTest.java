package org.ryyaan2004.datastructure;

import org.junit.Test;
import org.ryyaan2004.datastructures.MinHeap;
import org.junit.Assert;

public class MinHeapTest {
	
	@Test
	public void newHeapWithSmallArrayBecomesMinHeap()
	{
		int expectedRootValue = 1;
		int[] arr = { 2,3,1 };
		MinHeap h = new MinHeap(arr);
		Assert.assertEquals( "The getRoot method does not return the expected node value: "
						   , expectedRootValue
						   , h.getRoot() );
	}
	
	@Test 
	public void newHeapWithLargeArrayBecomesMinHeap()
	{
		int expectedRootValue = 1;
		int[] arr = { 90, 16, 14, 18, 88, 79, 6, 1, 10, 10, 21, 3 };
		MinHeap h = new MinHeap(arr);
		Assert.assertEquals( "The getRoot method does not return the expected node value: "
						   , expectedRootValue
						   , h.getRoot() );
	}
}
