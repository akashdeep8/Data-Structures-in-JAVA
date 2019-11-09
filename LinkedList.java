class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head;
    
    public void insertAtEnd(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }
    public void insertAtPos(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        if(head==null)
        {
            insertAtStart(data);
        }
        else
        {
            Node n=head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }
    
        public void deletePos(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}
	
    
    public void show(){
        Node n=head;
        while(n.next!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
}
public class Main{
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtStart(40);
        list.insertAtPos(3,50);
        list.deletePos(2);
        list.show();
    }
}