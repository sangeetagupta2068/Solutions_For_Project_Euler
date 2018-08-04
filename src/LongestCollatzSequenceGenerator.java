//Problem 14 : To find the number under 1 million which has the longest collatz chain.
//this solution takes 551 milliseconds to execute.

public class LongestCollatzSequenceGenerator {

    private long getTerm(long mInteger) {

        if(mInteger % 2 == 0){
            return mInteger/2 ;
        }

        return mInteger * 3 + 1;
    }

    long getNumberForLongestChain(){

        long temporaryValue = 0;
        int maxCount = 0;
        int maxNumber = 0;

        for(int counter = 2; counter < 1000000 ; ++counter){

            int collatzCounter = 0;
            temporaryValue = counter;


            while (!(temporaryValue==1)){

                temporaryValue = getTerm(temporaryValue);
                collatzCounter = collatzCounter + 1;
            }

            if(maxCount<collatzCounter){
                maxCount = collatzCounter;
                maxNumber = counter;
            }

        }

        return maxNumber ;
    }

    public static void main(String... args){
        long startTime = System.currentTimeMillis();
        LongestCollatzSequenceGenerator longestCollatzSequenceGenerator = new LongestCollatzSequenceGenerator();
        System.out.println(longestCollatzSequenceGenerator.getNumberForLongestChain());
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
