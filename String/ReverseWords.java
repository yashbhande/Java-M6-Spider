// Input : Hello i am yash
// Output : hsay ma i olleH

public class ReverseWords
{
  	public static void main(String[] args) 
  {    
  		String str="Hello i am yash";
  		String rev="";
  		
  		for(int i=str.length()-1; i>=0; i--)
  		{
  		    rev= rev+str.charAt(i);
  		}
  		System.out.print(rev);
	}
}
