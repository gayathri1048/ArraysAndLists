// Question 5: Merge and Sort the elements in two Linked-List

// Skill Mapping: Intermediate

// Description: Consider two Linked-List with N number of integers in Data-Node respectively.

// Task 1- WAP in Java to merge both Linked-Lists.

// Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.

// Sample input: Linked-List-1:- 25->35->12->4->36->48

// Linked-List-2:- 8->32->22->45->63->49

// Output:- 4->8->12->22->25->32->35->36->45->48->49->63

import java.util.*;
class Nodelink{
	 int data;
	 Nodelink next;
	
}
public class LinkedListMerging {

	static private Nodelink head1,head2;
	static Nodelink insertNode(Nodelink head,int data)
	{
		Nodelink node=new Nodelink();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Nodelink temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
		return head;
	}
	static Nodelink Merginglinkedlists() {
		Nodelink temp=head1;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head2;
		return head1;
	}
	static void display(Nodelink head)
	{
		Nodelink temp=head;
		if(head==null)
		{
			System.out.println("null");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data);
				if(temp.next!=null)
				{
					System.out.print("->");
				}
				temp=temp.next;
			}
			
		}
	}
	static void sortinglists()
	{
		Nodelink head=Merginglinkedlists();
		Vector<Integer> V=new Vector<>();
		Nodelink temp=head;
		while(temp!=null)
		{
			V.add(temp.data);
			temp=temp.next;
		}
		Collections.sort(V);
		temp=head;
		int index=0;
		while(temp!=null)
		{
			temp.data=V.get(index);
			index++;
			temp=temp.next;
		}
		display(head);
		
		
		
	}
	public static void main(String[] args) {
		LinkedListMerging mergrelist=new LinkedListMerging();
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		for(int i=0;i<length;i++)
		{
			int data=sc.nextInt();
			 head1=insertNode(head1,data);
		}
		for(int i=0;i<length;i++)
		{
			int data=sc.nextInt();
			head2=insertNode(head2,data);
		}
		sortinglists();
		
		

	}

}


