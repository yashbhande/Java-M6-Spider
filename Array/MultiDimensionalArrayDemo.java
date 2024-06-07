import java.util.Arrays;

class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        
        // 2x3 2D array with all elements initialized to 10
        System.out.print("Array 1:  ");
        int[][] array1 = new int[2][3];
        for (int i = 0; i < array1.length; i++) {
            Arrays.fill(array1[i], 10);
        }
        System.out.println(Arrays.deepToString(array1));
        System.out.println();

        // 3-row jagged array with varied lengths for each row, filled with short values
        System.out.print("Array 2:  ");
        short[][] array2 = new short[3][];
        array2[0] = new short[2];
        array2[1] = new short[1];
        array2[2] = new short[2];
        array2[0][0] = 10;
        array2[0][1] = 10;
        array2[1][0] = 20;
        array2[2][0] = 10;
        array2[2][1] = 30;
        System.out.println(Arrays.deepToString(array2));
        System.out.println();

        // 2x2x2 3D array filled with short values
        System.out.print("Array 3:  ");
        short[][][] array3 = new short[2][2][2];
        array3[0][0][0] = 10;
        array3[0][0][1] = 20;
        array3[0][1][0] = 10;
        array3[0][1][1] = 40;
        array3[1][0][0] = 10;
        array3[1][0][1] = 40;
        array3[1][1][0] = 50;
        array3[1][1][1] = 30;
        System.out.println(Arrays.deepToString(array3));
        System.out.println();

        // 2x2 jagged 3D array with varied lengths for innermost arrays, filled with short values
        System.out.print("Array 4:  ");
        short[][][] array4 = new short[2][2][];
        array4[0][0] = new short[1];
        array4[0][1] = new short[2];
        array4[1][0] = new short[1];
        array4[1][1] = new short[3];
        array4[0][0][0] = 10;
        array4[0][1][0] = 20;
        array4[0][1][1] = 30;
        array4[1][0][0] = 40;
        array4[1][1][0] = 50;
        array4[1][1][1] = 60;
        array4[1][1][2] = 70;
        System.out.println(Arrays.deepToString(array4));
        System.out.println();

        // 2-layer jagged 3D array with varied lengths for middle arrays, filled with short values
        System.out.print("Array 5:  ");
        short[][][] array5 = new short[2][][];
        array5[0] = new short[3][1];
        array5[1] = new short[2][];
        array5[1][0] = new short[2];
        array5[1][1] = new short[3];
        array5[0][0][0] = 10;
        array5[0][1][0] = 20;
        array5[0][2][0] = 30;
        array5[1][0][0] = 40;
        array5[1][0][1] = 50;
        array5[1][1][0] = 60;
        array5[1][1][1] = 70;
        array5[1][1][2] = 80;
        System.out.println(Arrays.deepToString(array5));
        System.out.println();

        // 3-layer jagged 3D array with fixed innermost array lengths, filled with short values
        System.out.print("Array 6:  ");
        short[][][] array6 = new short[3][][];
        array6[0] = new short[1][2];
        array6[1] = new short[2][2];
        array6[2] = new short[3][2];
        array6[0][0][0] = 10;
        array6[0][0][1] = 20;
        array6[1][0][0] = 30;
        array6[1][0][1] = 40;
        array6[1][1][0] = 50;
        array6[1][1][1] = 60;
        array6[2][0][0] = 70;
        array6[2][0][1] = 80;
        array6[2][1][0] = 90;
        array6[2][1][1] = 100;
        array6[2][2][0] = 180;
        array6[2][2][1] = 280;
        System.out.println(Arrays.deepToString(array6));
        System.out.println();

        // 2x1x1 and 3-layer jagged 4D array with varied lengths for inner arrays, filled with short values
        System.out.print("Array 7:  ");
        short[][][][] array7 = new short[2][][][];
        array7[0] = new short[2][1][1];
        array7[1] = new short[3][][];
        array7[1][0] = new short[1][1];
        array7[1][1] = new short[2][1];
        array7[1][2] = new short[3][1];
        array7[0][0][0][0] = 10;
        array7[0][1][0][0] = 20;
        array7[1][0][0][0] = 30;
        array7[1][1][0][0] = 40;
        array7[1][1][1][0] = 50;
        array7[1][2][0][0] = 60;
        array7[1][2][1][0] = 70;
        array7[1][2][2][0] = 80;
        System.out.println(Arrays.deepToString(array7));
        System.out.println();
    }
}


/* Output
Array 1:  [[10, 10, 10], [10, 10, 10]]

Array 2:  [[10, 10], [20], [10, 30]]

Array 3:  [[[10, 20], [10, 40]], [[10, 40], [50, 30]]]

Array 4:  [[[10], [20, 30]], [[40], [50, 60, 70]]]

Array 5:  [[[10], [20], [30]], [[40, 50], [60, 70, 80]]]

Array 6:  [[[10, 20]], [[30, 40], [50, 60]], [[70, 80], [90, 100], [180, 280]]]

Array 7:  [[[[10]], [[20]]], [[[30]], [[40], [50]], [[60], [70], [80]]]]
*/
