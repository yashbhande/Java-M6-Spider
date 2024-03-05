//Program to print natural numbers e.g: 1,2,3,4,5,6,....... so on

class NaturalNumbers {
    public static void main(String[] args) {
      
        int num=1;
        do {
            System.out.println(num);
            // Increment num by 1
            num++;
        } while(num <= 10);
    }
}
