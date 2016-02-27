package org.ryyaan2004.datastructures;

public class Node implements Comparable<Node> {

	private Integer value;

	public Node(int i)
	{
		this.setValue(i);
	}
	
	public int getValue()
	{
		return this.value.intValue();
	}
	
	public void setValue(int i)
	{
		this.value = Integer.valueOf(i);
	}

	public int compareTo(Node otherNode) {
		return this.value.compareTo(otherNode.getValue());
	}

	@Override
	public int hashCode() {
		// Auto generated by eclipse
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// Auto generated by eclipse
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (this.value == null) {
			if (other.value != null)
				return false;
		} else if (!this.value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [value=").append(this.value).append("]");
		return builder.toString();
	}
}
