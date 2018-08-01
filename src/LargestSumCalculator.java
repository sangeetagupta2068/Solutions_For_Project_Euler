//This is the solution of problem 13 of Project euler in Java which takes about 1 millisecond to execute.
// Assuming that the given 100 numbers are stored in a file numbers.txt and each line of the text file represents a 50 digit number.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigInteger;

public class LargestSumCalculator {

    BigInteger sum;
    BigInteger number;

    LargestSumCalculator(){
        sum = BigInteger.ZERO;
        number = BigInteger.ZERO;
    }

    public void  calculateSum() throws Exception{

        int count = 0;
        BufferedReader inputReader = new BufferedReader(new FileReader("/home/sangeetagupta1998/Downloads/Project Euler/assets/numbers.txt"));

        String temporaryString = inputReader.readLine();

        while (temporaryString!=null) {
            count = count + 1;
            number = new BigInteger(temporaryString);
            temporaryString = inputReader.readLine();

            sum = sum.add(number);
        }
        inputReader.close();
    }

    public static void main(String... args) {

        LargestSumCalculator largestSumCalculator = new LargestSumCalculator();

        try {
            largestSumCalculator.calculateSum();

            long startTime = System.currentTimeMillis();

            System.out.println("Sum is: " +largestSumCalculator.sum);
            System.out.println("First ten digits of sum:  " +largestSumCalculator.sum.toString().substring(0,10));

            long endTime = System.currentTimeMillis() - startTime;
            System.out.println(endTime);

        } catch (Exception exception) {

            try {

                BufferedWriter ouputWriter = new BufferedWriter(new FileWriter("/home/sangeetagupta1998/Downloads/Project Euler/assets/Log.txt"));
                System.out.println("Exception occured: " + exception.toString());
                ouputWriter.write(exception.toString());
                ouputWriter.close();

            } catch (Exception ex) {
                System.out.println("Exception occured: " + ex.toString());
            }
        }

    }
}
