public class Node {
	private Node next;
	private Object item;
	
	public Node(){
		next=null;
		item=null;
	}
	
	public Node(Object newItem){
		next=null;
		item=newItem;
	}
	
	public Node(Object newItem, Node nextNode){
		next=nextNode;
		item=newItem;
	}
	
	public void setItem(Object newItem){
		item=newItem;
	}
	
	public Object getItem(){
		return this.item;
	}
	
	public void setNext(Node nextNode){
		next=nextNode;
	}
	
	public Node getNext(){
		return this.next;
	}
}
