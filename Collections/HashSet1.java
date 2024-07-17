import java.util.*;
class HashSet1 {
    public static void main(String[] args) {
        
        Set<String> hashSet = new HashSet<>();
        
        hashSet.add("A");
        hashSet.add("B");
        boolean r1 = hashSet.add("C");
        System.out.println("'C' added in set : "+r1);   //add 'c' in set
        boolean r2 = hashSet.add("C");
        System.out.println("'C' added in set : "+r2);   //add 'c' again -> not possible
        
        System.out.println("HashSet : "+hashSet);   //print hashset
        
        //check if they contains element
        System.out.println("Set contains 'D' or not ? : "+hashSet.contains("D")); 
        System.out.println("Set contains 'B' or not ? : "+hashSet.contains("B"));
        
        //remove operation
        hashSet.remove("A");
        System.out.println("Set after removing 'A' : "+hashSet);
        
    }
}

/* >>>>>  Output  <<<<<

'C' added in set : true
'C' added in set : false
HashSet : [A, B, C]
Set contains 'D' or not ? : false
Set contains 'B' or not ? : true
Set after removing 'A' : [B, C]

**********************/
