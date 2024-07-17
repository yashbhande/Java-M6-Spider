import java.util.*;
class TreeSet1 {
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<>();
        
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("e");
        treeSet.add("b");
        treeSet.add("d");
        
        System.out.println("TreeSet preserves the natural ordering of elements.");
        System.out.println("Input : 'c', 'a', 'e', 'b', 'd' ");
        System.out.println("Output : "+treeSet);
        
    }
}

/* >>>>> Output <<<<<

TreeSet preserves the natural ordering of elements.
Input : 'c', 'a', 'e', 'b', 'd' 
Output : [a, b, c, d, e]

````````````````` */
