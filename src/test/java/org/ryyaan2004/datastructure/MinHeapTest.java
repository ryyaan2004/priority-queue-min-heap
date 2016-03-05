package org.ryyaan2004.datastructure;

import org.junit.Test;
import org.ryyaan2004.datastructures.MinHeap;
import org.ryyaan2004.datastructures.Node;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void sortTheHeapInDescendingOrder()
	{
		int[] arr = { 7, 8, 1, 3, 2, 9, 5, 4, 6 };
		MinHeap h = new MinHeap(arr);
		Assert.assertNotEquals( "The MinHeap naturally sorted into an order that makes the following test pointless: "
				              , 9
				              , h.getValue(9));
		h.heapSort();
		Assert.assertEquals( "The returned first value in the MinHeap is not expected, implying incorrect ordering: "
						   , 9
						   , h.getValue(1) );
		Assert.assertEquals( "The returned last value in the MinHeap is not expected, implying incorrect ordering: "
						   , 1 
						   , h.getValue(9));
	}
	
	@Test
	public void append_a_node()
	{
		int[] arr = { 1, 2, 3, 4 };
		MinHeap h = new MinHeap(arr);
		Node n = new Node(5);
		h.appendNode(n);
		Assert.assertEquals( "The returned value was not expected, implying the append method doesn't work"
						   , 5
						   , h.getValue(5) );
	}
}
