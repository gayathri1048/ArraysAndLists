// Question 6: Remove Duplicates from Linked-List

// Skill Mapping: Intermediate

// Description: Consider a Linked-List with N number of repeated integers in Data-Node.

// Task - WAP in Java to remove the repeated integer numbers from Linked-List.

// Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5

// Output:- 2->5->12->3->1


import java.util.*;
class Nodenew{
	int data;
	Nodenew next;
}
public class deletingduplicated {
	static Nodenew head;
	deletingduplicated()
	{
		this.head=null;
	}
	static Nodenew insertNode(Nodenew head,int data)
	{
		Nodenew node=new Nodenew();
		node.data=data;
		if(head==null)
		{
			head=node;
			
		}
		else
		{
			Nodenew temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int data=sc.nextInt();
			head=insertNode(head,data);
		}
		Nodenew temp=head;
		while(temp!=null)
		{
			Nodenew temp1=temp.next;
			while(temp1!=null)
			{
				if(temp1.data==temp.data)
				{
					temp.next=temp1.next;
				}
				temp1=temp1.next;
			}
			temp=temp.next;
		}
		Nodenew pr=head;
		while(pr!=null)
		{
			System.out.print(pr.data);
			if(pr.next!=null)
			{
				System.out.print("->");
			}
			pr=pr.next;
		}

	}

}
