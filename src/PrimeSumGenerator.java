//Problem 10 : To find the sum of all prime numbers below 2 million.
//This solution takes about 7921 milliseconds to execute and generate the answer.

import java.math.BigInteger;

public class PrimeSumGenerator {

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

        private BigInteger getPrimeNumber(BigInteger limit){

            BigInteger bigInteger = new BigInteger("2");
            BigInteger counter = new BigInteger("3");

            while(counter.compareTo(limit)==-1) {

                if(isPrime(counter)) {
                    bigInteger = bigInteger.add(counter);

                }

                counter = counter.add(new BigInteger("2"));

            }

            return bigInteger;
        }

        public static void main(String... args) {
            PrimeSumGenerator primeSumGenerator = new PrimeSumGenerator();

            long startTime = System.currentTimeMillis();
            System.out.println(primeSumGenerator.getPrimeNumber(new BigInteger("2000000")));
            System.out.println(System.currentTimeMillis() - startTime);
        }

}
