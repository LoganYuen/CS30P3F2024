package LinkedList;

class Node {
	private String data;
	private Node next;

	
	//constructor
	public Node(String newData) 
	{
		data = newData;
		next = null;
	}
	
	
	//The node pointed to by next is returned
	public Node getNext() 
	{
		return(next);
	}
	
	
	//The node pointed to by next is changed to newNode
	public void setNext(Node newNode) 
	{
		next = newNode;
	}
	
	
	//The node pointed to by next is returned
	public String getData() 
	{
		return(data);
	}
}