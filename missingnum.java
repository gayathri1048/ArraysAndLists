// Question 2: Find missing numbers in array -

// Skill Mapping: Basic

// Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

// Sample input: arrNum = {1, 2, 4, 5, 6}

// Output: 3

// Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

// Output: 4, 7, 9, 12, 13
import java.util.*;
public class missingnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mislist=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int N,temp=0;
		N=sc.nextInt();
		int[] num=new int[N];
		for(int i=0;i<N;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++)
		{
			if(num[i+1]!=num[i]+1)
			{
				temp=num[i]+1;
				while(temp!=num[i+1]) {
				mislist.add(temp);
				temp=temp+1;
				}
			}
		}
		for(int i=0;i<mislist.size();i++)
		{
			System.out.print(mislist.get(i)+" ");
		}
		sc.close();

	}

}
