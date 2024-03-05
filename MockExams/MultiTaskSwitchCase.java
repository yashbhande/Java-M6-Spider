class MultiTaskSwitchCase {
    // This program performs different types of tasks based on the value of the 'task' variable:
    // 1. Check if the number is odd or even
    // 2. Check if the number is divisible by 7 and ends with 7 (buzz)
    // 3. Check if the number is positive, negative, or zero
    // 4. Check if the number is a two-digit number

    public static void main(String[] args) {
        int number = 17;
        int task = 3;

        switch (task) {
            case 1: {
                // Check if the number is odd or even
                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
                break;
            }
            case 2: {
                // Check if the number is divisible by 7 and ends with 7 (buzz)
                if (number >= 100) {
                    System.out.println("Can't check because the number is greater than or equal to 100.");
                } else {
                    if (number % 7 == 0 && number % 10 == 7) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println("Not Buzz");
                    }
                }
                break;
            }
            case 3: {
                // Check if the number is positive, negative, or zero
                if (number > 0) {
                    System.out.println(number + " is positive.");
                } else if (number < 0) {
                    System.out.println(number + " is negative.");
                } else {
                    System.out.println(number + " is zero.");
                }
                break;
            }
            case 4: {
                // Check if the number is a two-digit number
                if (number >= 10 && number <= 99) {
                    System.out.println(number + " is a two-digit number.");
                } else {
                    System.out.println(number + " is not a two-digit number.");
                }
                break;
            }
            default: {
                System.out.println("Invalid task number.");
                break;
            }
        }
    }
}
/* Output Section

17 is positive.

*/
