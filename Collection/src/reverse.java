import java.lang.*;
import java.util.*;
import java.util.ArrayList.*;
public class reverse {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();



        list.add("hashedin");
        list.add("by");
        list.add("Deloitte");
        list.add("2022");


        System.out.println("List : " + list);

        // Using reverse() method to
        // reverse the element order of list
        Collections.reverse(list);

        // Print all elements of list in reverse order
        // using reverse() method
        System.out.println("Reverselist: " + list);
    }
}