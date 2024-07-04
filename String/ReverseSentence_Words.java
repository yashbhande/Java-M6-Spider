// Input  : Hello i am yash
// Output : olleH i ma hsay

public class ReverseSentence_Words
{
	public static void main(String[] args) {
	    
		String str="Hello i am yash";
		String words[] =str.split(" ");
		
		String op="";
		
		for(String temp:words)
		{
		    String rev="";
		    for(int i=temp.length()-1; i>=0; i--)
		    {
		        rev= rev+temp.charAt(i);
		    }
		    op = op+rev+" ";
		}
		
		System.out.print(op);
	}
}
