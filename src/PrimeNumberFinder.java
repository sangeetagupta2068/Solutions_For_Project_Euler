//Problem 7: To find the 10001st prime number. This solution takes about 1990 milliseconds.

import java.math.BigInteger;

public class PrimeNumberFinder {

    private boolean isPrime(BigInteger number){

        if(number.remainder(new BigInteger("2")).equals(BigInteger.ZERO)){
            return false;
        }

        BigInteger counter = new BigInteger("3");
        BigInteger compareValue = number.sqrt();

        while ((counter.compareTo(compareValue)==-1 || counter.equals(compareValue))){
            if(number.remainder(counter).equals(BigInteger.ZERO)){
                return false;
            }

            counter = counter.add(new BigInteger("2"));
        }

        return true;
    }

    private BigInteger getPrimeNumber(long limit){

        BigInteger bigInteger = new BigInteger("3");
        BigInteger counter = new BigInteger("3");
        long counterForPrime = 2;

        while(counterForPrime < limit + 1) {

           if(isPrime(counter)) {
               bigInteger = counter;
               counterForPrime = counterForPrime + 1;

           }

            counter = counter.add(new BigInteger("2"));

        }

        return bigInteger;
    }

    public static void main(String... args) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        System.out.println("Answer: " + primeNumberFinder.getPrimeNumber(10001));
    }
}
