import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class L03GenericCollection {
    // important to include the line below
    public static void main(String[] args) { 
        // make sure to have an 'java.util.ArrayList' at the top
        // use of <> to store data types, eg: integer for next line
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        // ArrayList have no maximum size
        // it functions like the list in Python and array in JavaScript 
        numbers.add(42);
        numbers.add(33);
        numbers.add(55);

        System.out.println(numbers.get(1)); //do not use [] to access element

        // shortcut to creating new arraylist
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Tiffany");
        System.out.println(names);

        // map (is known as key-value pair - dictionary (Python) and objects (JavaScript)
        // we have to define the data type of the key and value
        Map<String, Integer> months = new HashMap<String, Integer>(); //the key is strict
        months.put("Jan", 31); //months["Jan"]=31 (Python syntax)
        months.put("Feb", 28); //month["Feb"]=28
        months.put("Mar", 31); //month["Mar"]=31

        System.out.println(months.get("Jan"));
        System.out.println("There are " + months.get("Feb") + " days in Feburary.");

        // when using generic collections, the data type in <> must be the class-eqv. of the primitive data type
        // if we want the collections to store a primitive data type
        // ArrayList<int> primeNumbers = new ArrayList<int> -> this would not work!!
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        ArrayList<Double> ratios = new ArrayList<Double>();
        ArrayList<Boolean> switches = new ArrayList<Boolean>();  
    }
}
