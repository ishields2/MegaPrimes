import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MegaPrimeTest {

    @org.junit.jupiter.api.Test
    void allDigitsArePrimeShouldReturnTrue() {

        boolean expected = true;
        boolean result = MegaPrime.allDigitsPrime(2357);

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void allDigitsNotPrimeShouldReturnFalse() {

        boolean expected = false;
        boolean result = MegaPrime.allDigitsPrime(16890);

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void someDigitsNotPrimeShouldReturnFalse() {

        boolean expected = false;
        boolean result = MegaPrime.allDigitsPrime(3517620);

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void individualDigitsNotPrimeShouldReturnFalse() {

        boolean result = true;
        boolean expected = false;

        ArrayList<Integer> nonPrime = new ArrayList<>();
        nonPrime.add(0);
        nonPrime.add(1);
        nonPrime.add(4);
        nonPrime.add(6);
        nonPrime.add(9);

        for (Integer i : nonPrime) {
            if (MegaPrime.allDigitsPrime(i)) {
                result = true;
                break;
            } else {
                result = false;
            }
        }
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void individualDigitsAllPrimeShouldReturnTrue() {

        boolean result = false;
        boolean expected = true;

        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(7);

        for (Integer i : prime) {
            if (MegaPrime.allDigitsPrime(i)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertEquals(expected, result);
    }


    @org.junit.jupiter.api.Test
    void validPrimeNumbersShouldReturnTrue() {

        boolean expected = true;
        boolean result = false;

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(41);
        primeNumbers.add(73);
        primeNumbers.add(113);
        primeNumbers.add(149);
        primeNumbers.add(239);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(2);

        for (int prime : primeNumbers) {
            if (MegaPrime.isPrime(prime)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void invalidPrimeNumbersShouldReturnFalse() {

        boolean expected = false;
        boolean result = true;

        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(0);
        primeNumbers.add(1);
        primeNumbers.add(250);
        primeNumbers.add(1000);
        primeNumbers.add(6);
        primeNumbers.add(10);
        primeNumbers.add(25);
        primeNumbers.add(102);
        primeNumbers.add(244);

        for (int prime : primeNumbers) {
            if (!MegaPrime.isPrime(prime)) {
                result = false;
            } else {
                result = true;
                break;
            }
        }
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void shouldFilterMegaPrimes1() {

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        ArrayList result = MegaPrime.calculateMegaPrimes(10);

        assertEquals(expected, result);
    }


    @org.junit.jupiter.api.Test
    void shouldFilterMegaPrimes2() {

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(23);
        expected.add(37);
        ArrayList result = MegaPrime.calculateMegaPrimes(37);

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void shouldFilterMegaPrimes3() {

        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList result = MegaPrime.calculateMegaPrimes(1);

        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void shouldFilterMegaPrimes4() {

        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList result = MegaPrime.calculateMegaPrimes(0);

        assertEquals(expected, result);
    }
}