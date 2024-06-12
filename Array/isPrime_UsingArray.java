import java.util.*;

class isPrime_UsingArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14,15,16,17,18,19,20};

        // Find the count of Prime Elements
        int count = 0;
        for (int num : arr) 
        {
            if (num > 1) 
            {
                boolean isPrime = true;
                for (int i = 2; i <= num / 2; i++) 
                {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) 
                {
                    count++;
                }
            }
        }

        int[] primeNumbers = new int[count];

        // Index variable to store elements in PrimeNumber Array
        int indx = 0; // for index sizing in new Array

        // Find primes and store in new Array
        for (int num : arr) 
        {
            if (num > 1) 
            {
                boolean isPrime = true;
                for (int i = 2; i <= num / 2; i++) 
                {
                    if (num % i == 0) 
                    {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) 
                {
                    primeNumbers[indx++] = num;
                }
            }
        }

        System.out.println(Arrays.toString(primeNumbers));
    }
}

//Prime : [2, 3, 5, 7, 11, 13, 17, 19]

