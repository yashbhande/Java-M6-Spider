import java.util.*; // Importing the utility package which includes the Arrays class

class MD_ArraysUsing_1stSyntax {
    public static void main(String[] args) {
        
        // Initializing a 2D array
        int a[][] = {{10, 20}, {30, 40, 50}, {60, 70}};
        // Printing the 2D array using Arrays.deepToString() method
        System.out.println("2D Array : " + Arrays.deepToString(a));
        
        // Initializing a 3D array
        int b[][][] = {{{10, 20}, {30, 40, 50}}, {{60}, {70, 80, 90, 100}}};
        // Printing the 3D array using Arrays.deepToString() method
        System.out.println("3D Array : " + Arrays.deepToString(b));
        
        // Initializing another 3D array with different structure
        int c[][][] = {{{10, 20}, {30, 40, 50}}, {{60}, {70, 80}, {90}}};
        // Printing the 3D array using Arrays.deepToString() method
        System.out.println("3D Array : " + Arrays.deepToString(c));
        
        // Initializing another 2D array with different structure
        int d[][] = {{10, 20, 30}, {30, 40}, {60, 70, 80}};
        // Printing the 2D array using Arrays.deepToString() method
        System.out.println("2D Array : " + Arrays.deepToString(d));
    }
}


// 2D Array : [[10, 20], [30, 40, 50], [60, 70]]
// 3D Array : [[[10, 20], [30, 40, 50]], [[60], [70, 80, 90, 100]]]
// 3D Array : [[[10, 20], [30, 40, 50]], [[60], [70, 80], [90]]]
// 2D Array : [[10, 20, 30], [30, 40], [60, 70, 80]]
