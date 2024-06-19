import java.util.*;
class test1 
{
    public static void main(String[] args) 
  {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>(List.of(80,90,100,150));  //add Elements directly to Array B 
        System.out.println("Array List A: "+a);    //print ArrayList A
        System.out.println("Array List B: "+b);    //print ArrayList B
        
        
        a.add(10);      //(numberToAdd)
        System.out.println("Number added Succesfullt in Array A (at end): "+a);
        a.add(0, 5);    //(index, numberToAdd)
        System.out.println("Number added Succesfullt in Array A (at specific index): "+a);
        a.addAll(b);    //(numberToAdd from ArrayList 'b')
        System.out.println("Added Elements of Array B into Array A at Last: "+a);
        a.addAll(1, b); //(index, numberToAdd from ArrayList 'b')
        System.out.println("Added Elements of Array B into Array A at specific Position: "+a);
        
        System.out.println("Find Element -> Return Boolean if present : "+a.contains(20));     //to find element (return boolean)
        System.out.println("find element at specific Index : "+a.get(3));           //find element at specific Index
        System.out.println("find element from starting : "+a.indexOf(50));      //find element from starting
        System.out.println("find element from last : "+a.lastIndexOf(50));  //find element from last
        System.out.println("remove element at Index : "+a.remove(5));        //remove element at Index
        System.out.println(a);
        System.out.println("(index, toReplaceWith) : "+a.set(0, 200));      //(index, toReplaceWith)
        System.out.println(a);

      //to print all the elements
        // for(int i=0 ; i<a.size() ; i++)
        //     System.out.println("Element at index "+i+" : "+a.get(i));
      System.out.println("\n \n All Elements Printed Using Loop :");
        for(int temp: a)
            System.out.println(temp);
    }
}


/* ************* Output ***************/ /*
Array List A: []
Array List B: [80, 90, 100, 150]
Number added Succesfullt in Array A (at end): [10]
Number added Succesfullt in Array A (at specific index): [5, 10]
Added Elements of Array B into Array A at Last: [5, 10, 80, 90, 100, 150]
Added Elements of Array B into Array A at specific Position: [5, 80, 90, 100, 150, 10, 80, 90, 100, 150]
Find Element -> Return Boolean if present : false
find element at specific Index : 100
find element from starting : -1
find element from last : -1
remove element at Index : 10
[5, 80, 90, 100, 150, 80, 90, 100, 150]
(index, toReplaceWith) : 5
[200, 80, 90, 100, 150, 80, 90, 100, 150]

Element at index 0 : 200
Element at index 1 : 80
Element at index 2 : 90
Element at index 3 : 100
Element at index 4 : 150
Element at index 5 : 80
Element at index 6 : 90
Element at index 7 : 100
Element at index 8 : 150

=== Code Execution Successful ===
  */


