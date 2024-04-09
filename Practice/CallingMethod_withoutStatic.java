// Class demonstrating method calling without using static keyword

class CallingMethod_withoutStatic {
    public static void main(String[] args) {
        
        // Creating an instance of the CallingMethod_withoutStatic class
        CallingMethod_withoutStatic ok = new CallingMethod_withoutStatic();
        
        // Calling the yash method using the instance
        ok.yash();
    }
    
    // Method definition
    public void yash() {
        System.out.println("Method hi");
    }
}
