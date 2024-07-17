import java.util.*;
class LinkedList1 {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();
        
        //Insert Elements into LinkedList
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Origial List: "+list+"\n");
        
        //add "E" at 2nd index 
        list.add(2,"E");   
        System.out.println("Add element 'E' on 2nd index: "+list+"\n");
        
        list.addFirst("Yash");
        System.out.println("'Yash' Added first: "+list+"\n");
        
        list.addLast("Bhande");
        System.out.println("'Bhande' Added last: "+list+"\n");
        
        list.remove("Bhande");
        System.out.println("'Bhande' removed from last: "+list+"\n");
        
        list.removeFirst();
        System.out.println("Removed from First: "+list+"\n");
        
        list.removeLast();
        System.out.println("Removed from Last: "+list+"\n");
        
        list.clear();
        System.out.println("Removed All using clear() : "+list+"\n");
        
    }
}

/*>>>>>>>>>   OutPut   <<<<<<<<<
  
Origial List: [A, B, C, D]

Add element 'E' on 2nd index: [A, B, E, C, D]

'Yash' Added first: [Yash, A, B, E, C, D]

'Bhande' Added last: [Yash, A, B, E, C, D, Bhande]

'Bhande' removed from last: [Yash, A, B, E, C, D]

Removed from First: [A, B, E, C, D]

Removed from Last: [A, B, E, C]

Removed All using clear() : []

----------------- */
