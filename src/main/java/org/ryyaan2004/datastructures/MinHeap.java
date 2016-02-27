package org.ryyaan2004.datastructures;

import java.lang.Math;

public class MinHeap {

	Node[] nodes;
	
	/**
	 * Build-Min-Heap(A)
	 * 
	 * @param initialValues
	 */
	public MinHeap(int[] initialValues)
	{
		nodes = new Node[initialValues.length + 1];
		for ( int i = 1; i <= initialValues.length; i++ )
		{
			nodes[i] = new Node(initialValues[i - 1]);
		}
		
		for ( int i = (initialValues.length/2); i >= 1; i-- )
		{
			minHeapify(i);
		}
	}
	
	public int getRoot()
	{
		return nodes[1].getValue();
	}
	
	public int heapSize()
	{
		return nodes.length - 1;
	}
	
	private int getParent(int i)
	{
		return (int) Math.floor( i/2 );
	}
	
	private int getLeftChild(int i)
	{
		return (int) Math.floor( 2*i );
	}
	
	private int getRightChild(int i)
	{
		return (int) Math.floor( 2*i+1 );
	}
	
	private Node getNode(int i)
	{
		return nodes[i];
	}
	
	int getHeight()
	{
		return getLg(nodes.length);
	}
	
	/**
	 * Apparently the java Math.log function isn't the best for
	 * integer logarithms but it should be good enough for this
	 * purpose I hope
	 */
	int getLg(int a)
	{
		return (int)( Math.log(a)/Math.log(2) );
	}
	
	int getCountOfLeaves()
	{
		return (int) Math.ceil( nodes.length / 2);
	}
	
	void swap(int i, int j)
	{
		Node nodeI = nodes[i];
		nodes[i] = nodes[j];
		nodes[j] = nodeI;
	}
	
	/**
	 * Typically the signature of MIN-HEAPIFY would be
	 * <code>MIN-HEAPIFY(A,i)</code> where A is the array
	 * and i is the index postion from which to start. However
	 * we're containing the array in this class and this class
	 * should only be operating on it's own members
	 * 
	 * @param nodeIndex
	 */
	void minHeapify(int nodeIndex)
	{
		int leftChildIndex = getLeftChild(nodeIndex);
		int rightChildIndex = getRightChild(nodeIndex);
		int smallestIndex;
		
		/*
		 * find the smallest, it should be at "top" 
		 * or root of our 3 node "tree" 
		 */
		if ( leftChildIndex <= heapSize() &&
				getNode(leftChildIndex).lessThan(getNode(nodeIndex)) )
		{
			smallestIndex = leftChildIndex;
		}
		else
		{
			smallestIndex = nodeIndex;
		}
		
		if ( rightChildIndex <= heapSize() &&
				getNode(rightChildIndex).lessThan(getNode(smallestIndex)) )//nodeIndex)) )
		{
			smallestIndex = rightChildIndex;
		}
		
		/*
		 * make our swap and a recursive call to ensure
		 */
		if ( smallestIndex != nodeIndex )
		{
			swap(nodeIndex, smallestIndex);
			minHeapify(smallestIndex);
		}
	}
}
