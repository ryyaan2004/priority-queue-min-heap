package org.ryyaan2004.datastructure;

import org.junit.Test;
import org.ryyaan2004.datastructures.MinHeap;
import org.junit.Assert;

public class MinHeapTest {
	
	@Test
	public void newHeapWithProvidedArrayBecomesMinHeap()
	{
		int expectedRootValue = 1;
		int[] arr = { 2,3,1 };
		MinHeap h = new MinHeap(arr);
		Assert.assertEquals( "The getRoot method does not return the expected node value: "
						   , expectedRootValue
						   , h.getRoot() );
	}
}
