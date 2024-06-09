import java.util.*; // Import HashSet class

class HashSet_UniqueElements_Array {
    public static void main(String[] args) 
    {
        Set<Integer> st = new HashSet<>(); // Create HashSet
        int arr[] = {1, 1, 2, 3, 3, 4, 5, 6, 7, 8}; // Initialize array with duplicates
        System.out.println("Original Array : "+ Arrays.toString(arr)+"\n");

        for (int i : arr) // Loop through array
        { 
            if (st.add(i)) // Add element to HashSet
            { 
                System.out.println("Added: " + i); // Element added
            } else 
            {
                System.out.println("Duplicate: " + i); // Element duplicate
            }
        }

        System.out.println(); 
        System.out.println("Unique Elements in Array: " + st); 
    }
}
