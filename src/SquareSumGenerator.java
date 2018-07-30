//Problem 6 :to find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
//This solution takes 68 milliseconds.

public class SquareSumGenerator {

    private long sumGenerator(int limit){

        int counter = 1;
        long sumofSquares = 0;
        long sumSqaure = 0;
        long difference = 0;

        while (counter < limit + 1) {

            sumofSquares = sumofSquares + (long) Math.pow(counter, 2);
            sumSqaure = sumSqaure + counter;
            ++counter;

        }

        difference = (long)Math.pow(sumSqaure,2) - sumofSquares;
        return difference;
    }

    public static void main(String... args){

        SquareSumGenerator squareSumGenerator = new SquareSumGenerator();
        System.out.println("Ans: " + squareSumGenerator.sumGenerator(100));
    }

}
