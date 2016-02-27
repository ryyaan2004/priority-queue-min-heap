package org.ryyaan2004.datastructures;

import java.lang.Math;

public class MinHeap {

	Node[] nodes;
	
	public MinHeap(int[] initialValues)
	{
		nodes = new Node[initialValues.length];
		for ( int i = 0; i < initialValues.length; i++ )
		{
			nodes[i] = new Node(initialValues[i]);
		}
	}
	
	public int getRoot()
	{
		return nodes[0].getValue();
	}
	
	public int heapSize()
	{
		return nodes.length;
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
	
	private int getHeight()
	{
		return getLg(nodes.length);
	}
	
	/**
	 * Apparently the java Math.log function isn't the best for
	 * integer logarithms but it should be good enough for this
	 * purpose I hope
	 */
	private int getLg(int a)
	{
		return (int)( Math.log(a)/Math.log(2) );
	}
	
	private int getCountOfLeaves()
	{
		return (int) Math.ceil( nodes.length / 2);
	}
}
