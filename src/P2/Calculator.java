package P2;

import java.util.ArrayList;

public class Calculator {
    public static double calculator(ArrayList<Media> media) {
        double count = 0;
        for (Media med : media) {
            if (med instanceof  Film) {
                count += med.prod;

            } else if (med instanceof Serial) {
                count += med.prod * ((Serial) med).kolS;
            }


        }
        return count/1440;
    }
}
