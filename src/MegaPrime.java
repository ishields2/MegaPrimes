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
            // get the last digit from n
            int digit = n % 10;

            // check if it's prime or not, if not return false immediately since not megaprime
            if (digit != 2 && digit != 3 && digit != 5  && digit != 7) {
                return false;
            }

            // chop off the last digit of n so we can grab the next one
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

        // loop whilst we are within the square root of n
        for (int i = 2; i * i <= n; i++) {
          if (n % i == 0)
               return false;
        }

        return true;
    }

    /**
     * Identifies all megaprime numbers from 1 to max inclusive.
     *
     * @param max a non-negative number
     * @return an ArrayList containing all megaprimes from 1 to max inclusive
     */
    public static ArrayList calculateMegaPrimes(long max) {
        ArrayList<Long> megaPrimes = new ArrayList<Long>();

        if (max == 2) {
            megaPrimes.add(max);
        }

        for (int i = 2; i <= max; i++) {
            if (allDigitsPrime(i) && isPrime(i)) {
                megaPrimes.add(Long.valueOf(i));
            }
        }

        return megaPrimes;
    }
}



