public class DoublyLinkedList {
	DoubleLink head;
	DoubleLink curr;
	DoubleLink last;
	DoubleLink prevLink;
	DoubleLink nextLink;
	DoubleLink newNode;
	
	public boolean search(Object item){
		curr=head;
		
		boolean status=false;
		return status;
	}
	
	public boolean delete(Object item){
		return false;
	}
	
	public void add(Object newItem){
		newNode=new DoubleLink(newItem);
		if(head==null){
			//No nodes in this LinkedList to begin with
			newNode.setNext(null);
			newNode.setPrecede(null);
			head=newNode;
		}else{
			newNode.setNext(head);
			newNode.setPrecede(null);
			head.setPrecede(newNode);
			head=newNode;
		}
	}
	
	public boolean insertBefore(Object newItem, Object location){
		//TODO
		return false;
	}
	
	public boolean insertAfter(Object newItem, Object location){
		//TODO
		return false;
	}
	
	public void appendToTail(Object newItem){
		//TODO
	}
	
	public void ShowData(){
		//TODO
	}
}
