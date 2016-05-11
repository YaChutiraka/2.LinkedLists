public class SinglyLinkedList {
	Node curr;
	Node prev;
	Node head;
	Node newNode;
	
	public void add(Object newItem){
		 // Insert at "head"
		if(head==null){
			newNode=new Node(newItem);
			head=newNode;
		}else{
			newNode=new Node(newItem, head);
			head=newNode;
		}
	}
	
	public boolean insertBefore(Object newItem, Object location){ 
		// Insert "between" (prev and curr)
		while(curr!=null){
			if(curr.getItem()==location){
				newNode=new Node(newItem);
				prev.setNext(newNode);
				newNode.setNext(curr);
				return true;
			}else{
				prev=curr;
				curr=curr.getNext();
			}
		}
		return false;
	}
	
	public boolean insertAfter(Object newItem, Object location){ 
		// Insert "between" (curr and next)
		while(curr!=null){
			if(curr.getItem()==location){
				newNode=new Node(newItem);
				newNode.setNext(curr.getNext());
				curr.setNext(newNode);
				return true;
			}else{
				prev=curr;
				curr=curr.getNext();
			}
		}
		return false;
	}
	
	public void appendToTail(Object newItem){
		// Insert at "tail"
		if(head==null){
			newNode=new Node(newItem);
			head=newNode;
		}else{
			while(curr!=null){
				prev=curr;
				curr=curr.getNext();
			}
			newNode=new Node(newItem);
			prev.setNext(newNode);
		}
	}
	
	public boolean search(Object item){
		boolean status=false;
		curr=head;
		prev=null;
		while(curr!=null){
			if(curr.getItem()==item){
				status=true;
				break;
			}else{
				prev=curr;
				curr=curr.getNext();
			}
		}
		return status;
	}
	
	public boolean delete(Object item){
		if(search(item)){
			if(prev==null){
				curr=curr.getNext();
				head=curr;
			}else{
				prev.setNext(curr.getNext());
			}
			return true;
		}else {
			System.out.print("Item to be deleted is not found");
			return false;
			}
	}
	
	public void showData(){
		curr=head;
		while(curr!=null){
			if(curr.getNext()!=null){
				System.out.print(curr.getItem()+" -> ");
				curr=curr.getNext();
			}else{
				// Last printed item does not need to have " -> "
				System.out.print(curr.getItem());
				curr=curr.getNext();
			}
		}
	}
}
