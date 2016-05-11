public class DoubleLink {
	private Object item;
	private DoubleLink precede;
	private DoubleLink next;
	
	public DoubleLink(){
		item=null;
		precede=null;
		next=null;
	}
	
	public DoubleLink(Object newItem){
		item=newItem;
		precede=null;
		next=null;
	}
	
	public DoubleLink(Object newItem, DoubleLink newPrecede, DoubleLink newNext){
		item=newItem;
		precede=newPrecede;
		next=newNext;
	}
	
	public void setItem(Object newItem){
		item=newItem;
	}
	
	public void setNext(DoubleLink newNext){
		next=newNext;
	}
	
	public void setPrecede(DoubleLink newPrecede){
		precede=newPrecede;
	}
	
	public Object getItem(){
		return item;
	}
	
	public DoubleLink getNext(){
		return next;
	}
	
	public DoubleLink getPrecede(){
		return precede;
	}

}
