import java.util.*;
class javastack{
	static boolean valid(String str)
    {
        Stack<Character> stack=new Stack<Character>();
        int i=0;
        while(i<str.length())
        {
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')
            {
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty())
                {
                    return false;
                }
                else{
                    if((stack.peek()=='{' && str.charAt(i)=='}') || (stack.peek()=='[' && str.charAt(i)==']') || (stack.peek()=='(' && str.charAt(i)==')'))
                    {
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            i++;
            
        }
        return stack.isEmpty();
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(valid(input));
		}
		
	}
}



