// This prorgam is to check where the array is Palindrome or Not
//   1.Reverse the array and store it in other array
//   2.Compare if both array are same (rev == org)-> Yes:"Palindorme"  || No: "Not Palindome
//Sample 
//Org: [1,2,3,2,1]
//Rev: [1,2,3,2,1] -> Palindorme

import java.util.*;
class PalindromeEasyArray 
{
    public static void main(String[] args) 
    {
        int a[] = {1, 2, 1};
        int rev[]= new int[a.length];
        int pos=0;
        
        for(int i=a.length-1 ; i>=0; i--)
        {
            rev[pos++]=a[i];
        }
        
        if(Arrays.equals(a,rev))  
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");
            
        System.out.println("Original Array:"+Arrays.toString(a));
        System.out.println("Reversed Array:"+Arrays.toString(rev));
    }
}
