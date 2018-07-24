public class NumberPatternGenerator {

    public int sumOfEvenFibonacciPattern(int limit){

        int fiboNumberOne = 0, fiboNumberTwo = 1, fiboNumberThree = 0,counter = 0,sum = 0;

        while(fiboNumberThree<limit){

            fiboNumberThree = fiboNumberOne + fiboNumberTwo;
            fiboNumberOne = fiboNumberTwo;
            fiboNumberTwo = fiboNumberThree;

            if(fiboNumberThree%2==0){
               sum = sum + fiboNumberThree;
            }

        }
        return sum;
    }

    public static void  main(String... args){

        NumberPatternGenerator numberPatternGenerator = new NumberPatternGenerator();
        System.out.println("Sum is: " + numberPatternGenerator.sumOfEvenFibonacciPattern(4000000));
    }
}
