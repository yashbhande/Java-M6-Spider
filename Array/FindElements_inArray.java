class FindElements_inArray {
    public static void main(String[] args) {
        // Initializing an array with integers
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        
        // Element to find in the array
        int findElements = 770;
        
        // Flag to check if the element is found
        boolean flag = true;

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is the one we are looking for
            if (findElements == arr[i]) {
                // Print the position of the element (i+1 for 1-based index)
                System.out.println("Element found on Position : " + (i + 1));
                // Set flag to false since element is found
                flag = false;
                // Exit the loop since the element is found
                break;
            }
        }

        // If the flag is still true, the element was not found
        if (flag) {
            System.out.println("Elements not found.");
        }
    }
}

/*Output
Positive :Element found on Position 5
Negative :Element not found.

*/
