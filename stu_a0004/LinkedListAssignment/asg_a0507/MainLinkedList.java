class MainLinkedList
{
public static void main(String args[])
{
LinkedList x=new LinkedList();
x.addAtHead(2);
x.addAtHead(3);
x.addAtHead(4);
x.addAtHead(5);
x.printAll();
System.out.println("\nAfter deleting element to head ");
x.delFromHead();
x.printAll();

}
}
