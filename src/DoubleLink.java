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
	
	public DoubleLink(Object newItem, DoubleLink precedeLink, DoubleLink nextLink){
		item=newItem;
		precede=precedeLink;
		next=nextLink;
	}
	
	public void setItem(Object newItem){
		item=newItem;
	}
	
	public void setNext(DoubleLink nextLink){
		next=nextLink;
	}
	
	public void setPrecede(DoubleLink precedeLink){
		precede=precedeLink;
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
