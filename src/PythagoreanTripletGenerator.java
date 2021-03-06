import java.util.Scanner;


public class PythagoreanTripletGenerator {

    Triplet triplet;

    PythagoreanTripletGenerator(Triplet triplet){
        this.triplet = triplet;
    }


    public String checkPythagoreanTriplet(){

        String message = "";
        if(triplet.validateTriplet()){

            message = "Triangle can be formed";
            if((Math.pow(triplet.height,2) + Math.pow(triplet.base,2))== Math.pow(triplet.hypotaneous,2)){

                message = message +  " and is a pythagorean triplet";
            } else {
                message = message + " and is not a pythagorean triplet";
            }
        } else {
            message = "Triangle cannot be formed and isn't a pythagorean triplet";
        }
        return message;
    }

    public  static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        int base,height,hypotaneous;
        String flag = "yes";
        do {
            System.out.println("Enter the sides of the triangle.");
            System.out.println("Note: Only enter integer values else decimal values would be depreciated.");

            System.out.println("Enter height:");
            height = (int) scanner.nextDouble();

            System.out.println("Enter base:");
            base = (int) scanner.nextDouble();

            System.out.println("Enter hypotaneous: ");
            hypotaneous = (int) scanner.nextDouble();

            Triplet triplet = new Triplet(height, base, hypotaneous);

            PythagoreanTripletGenerator pythagoreanTripletGenerator = new PythagoreanTripletGenerator(triplet);
            System.out.println(pythagoreanTripletGenerator.checkPythagoreanTriplet());

            System.out.println("Do you want to try again?(Yes/No)");
            flag = scanner.next().toLowerCase();

        } while(flag.equals("yes"));

    }
}
