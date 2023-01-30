import java.util.ArrayList;

/**
 * Contains functionality and utility methods for handling megaprime
 * and prime numbers.
 *
 * @author Ian Shields
 */
public class MegaPrime {

    /**
     * Determines if all digits within a given value are prime.
     *
     * @param n the value to check
     * @return true if all digits are prime or false otherwise
     */
    public static boolean allDigitsPrime(int n) {
        if (n == 0) {
            return false;
        }
        while (n > 0) {
            int digit = n % 10;

            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                return false;
            }

            n = n / 10;
        }
        return true;
    }

    /**
     * Determines if the given value is a prime number.
     *
     * @param n value to check for primality
     * @return true if n is prime or false otherwise
     */
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        // only need to iterate to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Identifies all megaprime numbers from 1 to max inclusive.
     *
     * @param max a non-negative number
     * @return an ArrayList containing all megaprimes from 1 to max inclusive
     */
    public static ArrayList calculateMegaPrimes(int max) {
        ArrayList<Integer> megaPrimes = new ArrayList<Integer>();
        for (int i = 2; i <= max; i++) {
            if (allDigitsPrime(i) && isPrime(i)) {
                megaPrimes.add(i);
            }
        }
        return megaPrimes;
    }
}



