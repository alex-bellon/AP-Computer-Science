import java.util.*;

public class Box_of_Donuts
{
    public static void main() {
        ArrayList<String> donuts = new ArrayList<String>();
        donuts.add("Honey Glazed");
        donuts.add("Chocolate Dip");
        donuts.add("Vanilla Dip");
        donuts.add("Sprinkled");
        for (int x=0; x<donuts.size(); x++){
            System.out.println(donuts.get(x));
        }
    }
}
