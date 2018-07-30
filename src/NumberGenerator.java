//Problem 5:What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//This solution takes about 41 milliseconds
public class NumberGenerator {


    public long getNumberDivisibleByAll(){

        long number = 2520;

        while(number%11!=0|| number%12!=0 || number % 13!=0 || number % 14!=0
                || number % 15 != 0 || number % 16 !=0 || number % 17 !=0
                || number %18 != 0 || number % 19 != 0 || number % 20 != 0){

            number = number + 20;

        }
        return  number;

    }

    public static void main(String... args){

        NumberGenerator numberGenerator = new NumberGenerator();
        long startTime = System.currentTimeMillis();
        System.out.println(numberGenerator.getNumberDivisibleByAll());
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println(endTime);

    }
}
