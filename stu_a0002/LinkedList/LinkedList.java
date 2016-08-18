public class LinkedList{

	private LinkNode head;

	LinkedList(){
		head = null;
	}
	public int addAtHead(int data){
		if(head==null){
			head = new LinkNode(data);
			head.setNext(null);
			return 0;
		}
		else{
			LinkNode temp = new LinkNode(data);
			temp.setNext(head);
			head = temp;
			return 0;
		}
	}
	public int addAtTail(int data){
		if(head==null){
			System.out.println("No data Found");
			return 0;
		}
		else{
			LinkNode temp = head;
			while(temp.getNext()!=null){
				temp = temp.getNext();	
			}
			LinkNode tail = new LinkNode(data);
			temp.setNext(tail);
			tail.setNext(null);
			return 0;
		}
	}
	public int addAtMiddle(int data,int node){
		LinkNode middle = new LinkNode(data);
		LinkNode temp = head;	
		for(int i=1;i<node;i++){
			temp = temp.getNext();		
		}
		LinkNode temp1 = temp.getNext();
		temp.setNext(middle);
		middle.setNext(temp1);
		return 0;
	}
	public void delFromHead(){
		head = head.getNext();
	}
	public void delFromTail(){
		LinkNode temp = head;
		LinkNode temp1 = temp.getNext();
		while(temp1.getNext()!=null){
			temp1 = temp1.getNext();
			temp = temp.getNext();
		}
		temp.setNext(null);
	}
	public int delFromMiddle(int node){
		LinkNode temp = head;
		for(int i=0;i<node;i++){
			temp = temp.getNext();				     	        	}			
		LinkNode temp1 = temp.getNext();
		LinkNode temp2=temp1.getNext();
		temp.setNext(temp2);
		return 0;
	}
	public int search(int data){
		LinkNode temp = head;
		int count = 0;
		while(temp!=null){
		if(temp.getData()==data)
			System.out.println("Node is Found at position :" +count);
			temp = temp.getNext();
			count++;	
		}return 0;
	}
	public void getElement(){
		LinkNode temp = head;
	        int count=0;
		while(temp!=null){
			temp = temp.getNext();
			count++;
		}
		System.out.println("Elements of LinkedList :" + count);
	}

	public void printAll(){
		if(head==null)
			System.out.println("No LinkedList  ");
		else{
			LinkNode temp = head;
			while(true){
				System.out.print(" " + temp.getData() + " ");
				temp = temp.getNext();
				if(temp==null){
					break;
				}
			}

		}
	}

}
