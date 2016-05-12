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
	
	public boolean insertBefore(Object location, Object newItem){ 
		// Insert "between" (prev and curr)
		if(search(location)){
			// Alternative_1: Make us of search(item) method
			newNode=new Node(newItem);
			if(head==null){
				//There is not LinkedList to begin with
				head=newNode;
			}else if(prev==null){
				//found location is at the head
				newNode.setNext(head);
				head=newNode;
			}else{
				prev.setNext(newNode);
				newNode.setNext(curr);
			}
			return true;
		}else{
			return false;
		}
		//Alternative_2: Do not make use of search(location) method
		/*
		curr=head;
		prev=null;
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
		return false;*/
	}
	
	public boolean insertAfter(Object location, Object newItem){ 
		// Insert "between" (curr and next)
		if(search(location)){
			newNode=new Node(newItem);
			if(head==null){
				head=newNode;
			}else if(prev==null){
				//found location is at the head
				//This else if block can be combined with the else block below
				newNode.setNext(curr.getNext());
				curr.setNext(newNode);
			}else{
				//This else block can be combined with the else if block above
				newNode.setNext(curr.getNext());
				curr.setNext(newNode);
			}
			return true;
		}else{
			return false;
		}
		
		// Alternative_2: Do not make use of search(location) method
		/*
		curr=head;
		prev=null;
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
		return false;*/
	}
	
	public void appendToTail(Object newItem){
		// Insert at "tail"
		curr=head;
		prev=null;
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
		// Note that == does not work if the passed in values are Double or Float
		boolean status=false;
		curr=head;
		prev=null;
		while(curr!=null){
			if(item.equals(10)){
			}
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
				// location to delete is at head
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
				System.out.println(curr.getItem());
				curr=curr.getNext();
			}
		}
	}
	
	//uncomment this code to test all methods
	/*
	public static void main(String[] args){
		SinglyLinkedList n=new SinglyLinkedList();
		Integer key=3;
		Integer number=555;
		Character character='c';
		String string="end";
		
		//add
		System.out.println("add 1, 2, 3, Add result: ");
		n.add(1);
		n.showData();
		n.add(2);
		n.showData();
		n.add(3);
		n.showData();
		System.out.println();
		//search
		System.out.println("search for "+key+", Search result: "+n.search(key));
		System.out.println();
		//delete
		System.out.println("delete "+key+", Delete result: "+n.delete(key));
		n.showData();
		System.out.println();
		//insertAfter at "tail"
		System.out.println("insertAfter (555 after 1 at tail), result: ");
		n.insertAfter(1, number);
		n.showData();
		System.out.println();
		//insertAfter at "head"
		System.out.println("insertAfter (20 at head), result: ");
		n.insertAfter(n.head.getItem(), 20);
		System.out.println();
		//insertAfter "between"
		System.out.println("insertAfter (1.5 between nodes), result: ");
		n.insertAfter(1, 1.5);
		n.showData();
		System.out.println();
		//insertBefore "between"
		System.out.println("insertBefore (c Before 555 at tail), result: ");
		n.insertBefore(number, character);
		n.showData();
		System.out.println();
		//insertBefore at "head"
		System.out.println("insertBefore (first at head), result: ");
		n.insertBefore(n.head.getItem(), "first");
		n.showData();
		System.out.println();
		//insertBefore at "between"
		System.out.println("insertBefore (DOG between nodes), result: ");
		n.insertBefore('c', "DOG");
		n.showData();
		System.out.println();
		//appendToTail
		System.out.println("appendToTail (end), result: ");
		n.appendToTail("end");
		n.showData();
	}
	*/
}
