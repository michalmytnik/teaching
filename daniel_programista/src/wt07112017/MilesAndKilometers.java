package wt07112017;

import static wt07112017.Count.kmToMiles;
import static wt07112017.Count.mlsToKilometers;

class Count {
    public static double kmToMiles(double a){
        double c = a*0.62;
        System.out.println("After converting km to miles we got " + c);
        return a;
    }
    public static double mlsToKilometers(double b) {
        double d = b*1.6;
        System.out.println("After converting miles to km we got " + d);
        return b;
    }
}

public class MilesAndKilometers {

    public static void main(String[] args) {
        kmToMiles(2);

        mlsToKilometers(3);

        Count fred = new Count();

        fred.kmToMiles(5);


    }
}
