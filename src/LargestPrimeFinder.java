//Problem 3: Find the largest prime factor of 600851475143.
//This solution takes about 31 milliseconds to give the answer.

import java.math.BigInteger;

public class LargestPrimeFinder {

    private BigInteger findMaxPrimeFactor(BigInteger number) {

        BigInteger bigInteger = new BigInteger("1");
        BigInteger counter = new BigInteger("3");

        while (number.remainder(new BigInteger("2")).equals(BigInteger.ZERO)) {
            number = number.divide(new BigInteger("2"));
            bigInteger = new BigInteger("2");
        }


        while(!(number.equals(BigInteger.ONE))){

             while (number.remainder(counter).equals(BigInteger.ZERO)){
                 bigInteger = counter;
                 number = number.divide(counter);
             }
            counter = counter.add(new BigInteger("2"));
        }

        return bigInteger;
    }


    public static void main(String... args) {

        LargestPrimeFinder largestPrimeFinder = new LargestPrimeFinder();

        long startTime = System.currentTimeMillis();
        System.out.println(largestPrimeFinder.findMaxPrimeFactor(new BigInteger("600851475143")));
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println(endTime);

    }
}
