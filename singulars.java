// Question 3: Find the count of singulars in array -

// Skill Mapping: Expert

// Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

// Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}

// Output: Count of singular socks = 3

// Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left

// Socks Id - 20: total count 3 => One pair of socks - 1 singular left

// Socks Id - 30: total count 1 => No pair of socks - 1 singular left

// Socks Id - 50: total count 1 => No pair of socks - 1 singular left

// So, Total number of Singular socks = 3
import java.util.*;
public class singulars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] num=new int[size];
		int count=1,singulars=0;
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			if(num[i]!=-1) {
			count=1;
		   for(int j=i+1;j<size;j++)
		   {
			   if(num[i]==num[j])
			   {
				   num[j]=-1;
				   count++;
			   }
		   }
		   if(count%2!=0)
		   {
			   singulars++;
		   }
			}
		}
		System.out.print(singulars);
		sc.close();

	}

}
