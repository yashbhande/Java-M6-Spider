//This program demonstrate how compare 3 numbers to find largest amoung them.
// Approach 1: Logical , Approach 2: Ternary Operator 

class LargestOf3Numbers {
    public static void main(String[] args) {
       int a=330, b=340,c=350;
       System.out.println("Value of A: " + a + "\n" + "Value of B: " + b + "\n" + "Value of C: "+c+"\n");
   
      // Approach 1: Logical
    
       if(a>b && a>c)
       {
           System.out.println("A is Greater");
       }else if 
       (b>a && b>c)
       {
           System.out.println("B is greater");
       }
       else
       {
           System.out.println("C is greater");
       } 
       
    // Approach 2: Ternary Operator
    /*
    String result= (a>b && a>c)?("A is greater"):
                   (b>a && b>c)?("B is greater"):
                    (c>a && c>b)?("C is greater"):
                    ("Every number is equal.");
                    System.out.println(result);
    */
    }
}
