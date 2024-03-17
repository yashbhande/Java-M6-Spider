// This program demonstrates 3 ways to reverse number
// 1. Using Algorithm , 2. Using StringBuffer class , 3. Using StringBuilder class

class ReverseNumber_Diffrent_Ways {
    public static void main(String[] args) {
        int num=1234;  //Number to reverse
        
    //  Way 1: Using algorithm
        int reverse=0;
        while(num!=0)
        {
            reverse=reverse*10 + num%10;  // 0+1234%10=4    40+3=43     430+2=432        4320+1=4321
            num/=10;    //1234/10=123   123/10=12   12/10=1     1/10=0
        }
        System.out.println("Reversed Number : "+reverse);
        
        
    // Way 2: Using StringBuffer class
    /*
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("Reversed Number : "+rev);
    */
    
    // Way 3: StringBuilder class
    /*
        StringBuilder sb1=new StringBuilder();
        sb1.append(num);
        StringBuilder rev=sb1.reverse();
        System.out.println("Reversed Number : "+rev);
    */
    
    }
}
