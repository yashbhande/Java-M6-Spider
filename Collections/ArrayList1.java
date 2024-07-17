import java.util.*;  
class ArrayList1 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>(5);
        
        //Insert Elements into ArrayList
        for(int i=0; i<=5; i++)
            list.add(i);
            
        //Print List after adding Elements    
        System.out.println(list);
        
        //Remove 4th index element from List
        list.remove(4);
        
        //Print list after removing
         System.out.println(list);
         
        //Print all elements one by one 
         for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i)+" ");
    }
}

// [0, 1, 2, 3, 4, 5]  -> List
// [0, 1, 2, 3, 5]     -> 4th index element removed
// 0 
// 1 
// 2 
// 3 
// 5 
