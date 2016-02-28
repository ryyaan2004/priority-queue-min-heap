# Priority Queue utilizing min-heap
An academic exercise

### Assumptions
	0) For the time being we're just using integers, no need for interfaces or generics...KISS
	1) A MinHeap must have at least 1 node (Root)
	
### TODOs
	Ran out of time. Still needs to implement priority queue using the underlying MinHeap implementation.
	The priority queue will need the following operations where S = the Set of elements

		* INSERT(S,x): insert element x into set S
			* MIN-HEAP-INSERT(A, key)
		* MIN(S): return element of S with minimum key
			* HEAP-MINIMUM(A)
		* EXTRACT-MIN(S): return the element of S with the largest key and remove it from S
			* HEAP-EXTRACT-MAX(A)
		* DECREASE-KEY(S,x,k): decrease the given element x's key to the new value k, if the current value is less than k then err,
			* HEAP-DECREASE-KEY(A,i,key)