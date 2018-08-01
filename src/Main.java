//Problem 9: This is the solution to the Problem 9 wherein we need to find the product of the
//pythagorean triplet whose sum is 1000.

public class Main {

    public static void print(String message) {
        System.out.println(message);
    }

    static class PythagoreanTripletGenerator{

        Triplet triplet;
        long product;
        int sum;

        PythagoreanTripletGenerator(){
            this.triplet = new Triplet(3,4,5);
            product = 1;
            sum = 0;

        }

        public long generateSpecialTripletProduct(int limit) {
            sum = limit;

            for( ; triplet.base<(sum/3) ; triplet.base ++){

                for(triplet.height = triplet.base ; triplet.height<(sum/2) ;triplet.height++){

                    triplet.hypotaneous = sum - triplet.base - triplet.height;

                    if(triplet.hypotaneous * triplet.hypotaneous == triplet.base * triplet.base + triplet.height * triplet.height){
                        product = triplet.base * triplet.height * triplet.hypotaneous;
                        return product;
                    }
                }
            }

            return 1;

        }

        public static void main(String... args) {
            PythagoreanTripletGenerator pythagoreanTripletGenerator = new PythagoreanTripletGenerator();
            print(Long.toString(pythagoreanTripletGenerator.generateSpecialTripletProduct(1000)));
        }
    }
}
