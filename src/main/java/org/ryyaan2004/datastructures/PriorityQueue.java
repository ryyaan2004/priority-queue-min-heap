package org.ryyaan2004.datastructures;

public class PriorityQueue extends MinHeap{

	public PriorityQueue(int[] initialValues) {
		super(initialValues);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * insert operates on self, therefore the classic
	 * <code>MIN-HEAP-INSERT(A,key)</code> signature is unnecessary
	 */
	public void insert(int key) {
		this.setHeapSize( this.getHeapSize() + 1);
		Node newNode = new Node(Integer.MAX_VALUE);
		this.appendNode(newNode);
		this.decreaseKey(this.getHeapSize(), key);
	}
	
	public int min() {
		return this.getRoot();
	}
	
	public int extractMin() {
		if ( this.heapSize() < 1 )
		{
			throw new IllegalStateException("heap-underflow");
		}
		int min = this.min();
		nodes[1] = nodes[this.getHeapSize()];
		this.setHeapSize(this.getHeapSize() - 1);
		this.minHeapify(1);
		return min;
	}
	
	public void decreaseKey(int i, int key) {
		Node node = this.getNode(i);
		if ( key > node.getValue() )
		{
			throw new IllegalArgumentException("new key is larger than current key for the specified node");
		}
		node.setValue(key);
		/*while ( i > 1 && this.getParent(i) > 1 )
		{
			this.swap(i, 1);
			i = this.getParent(i);
		}*/
		this.minHeapify(this.getParent(i));
	}
}
