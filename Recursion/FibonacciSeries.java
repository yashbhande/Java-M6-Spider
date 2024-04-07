//This program prints first 10 fibonacci numbers
// 0 1 1 2 3 5 8 13 21 34

class FibonacciSeries {
    static int current=1, previous=0, next=0, count=8; // Set count to 8 initially to print the first 10 Fibonacci numbers
    public static void main(String[] args) {
      //print first two fibonacci number which are 0 and 1
        System.out.println(previous);
        System.out.println(current);
      
        fibonici();  //calling method
    }
    
    public static void fibonici() {
      //Base case : if count becomes 0, stop recursion
        if (count == 0) {
            return;
        }

      //calculate next fibonacci number
        next = previous + current;
        previous = current;
        current = next;
        
        System.out.println(current);
        count--;        //decrement , for next itteration
        fibonici();
    }
}
