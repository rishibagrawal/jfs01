class MainLinkedList
{
public static void main(String args[])
{
LinkedList x=new LinkedList();
x.addAtHead(9);
x.addAtHead(8);
x.addAtHead(7);
x.addAtHead(6);
x.printAll();
x.addAtTail(10);
System.out.println("Adding element to tail");
x.printAll();

}
}
