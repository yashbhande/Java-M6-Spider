// This program demonstrates diffrents ways to swap numbers

class Swapping_Diffrent_Ways {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swapping values are..:"+a+" "+b);
        
        //Logic 1: Using Third variable
    /*    
        int c=0;
        c=a;    //C=10
        a=b;    //a=20
        b=c;    //b=10
        System.out.println("After swapping values are..:"+a+" "+b);
    */
    
        //Logic 2: Using '+' & '-'
     /*   
        a=a+b;  //10+20=30(a)
        b=a-b;  //30-20=10(b)
        a=a-b;  //30-10=20(a)
        System.out.println("After swapping values are..:"+a+" "+b);
      */  
      
        //Logic 3: Using '*' & '/'
    /*    
        a=a*b;  //10*20=200(a)
        b=a/b;  //200/20=10(b)
        a=a/b;  //200/10=20(a)
        System.out.println("After swapping values are..:"+a+" "+b);
    */    
        
        //Logic 4: Using Bitwise Operator '^'
    /*    
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping values are..:"+a+" "+b);
    */
    
        //Logic 5: Using 'Single Statement'
    /*    
        b=a+b - (a=b);
        System.out.println("After swapping values are..:"+a+" "+b);
    */    
        
    }
}
