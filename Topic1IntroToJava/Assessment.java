import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Assessment {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<Double>();
        Map<Double, Integer> pair = new HashMap<Double, Integer>();
        ArrayList<Double> numbers2 = new ArrayList<>();


        while (true){
            System.out.println("Enter decimal numbers, to stop, enter 0: ");
            Scanner sc = new Scanner(System.in);
            double input = sc.nextDouble();
            
            if (input != 0){
            numbers.add(input);
            }
            if (input == 0){

            // Mode
            for (double n: numbers){
                if (pair.containsKey(n)){
                    pair.put(n, pair.get(n) + 1);
                }
                else {
                    pair.put(n, 1);
                }
            }
            double current_maximum = 0;
            int current_count =0;
            for (Map.Entry<Double, Integer> entry: pair.entrySet()){
                
                // Key is float, value is count
                if (entry.getValue() > current_count)
                {
                    current_maximum = entry.getKey();
                    current_count = entry.getValue();
                }
            }
            System.out.println("Mode: " + current_maximum);

            // Average
            double sum = 0;
            for (double n: numbers)
            {
                sum += n;
            }
            double average = sum/numbers.size();
            System.out.println("Average: " + average);

            //Median
            if (numbers.size()%2 == 0){
                int mid_index = numbers.size()/2 -1;
                int mid_index2 = mid_index + 1;
                double median = (numbers.get(mid_index) + numbers.get(mid_index2))/2;
                System.out.println("Median: " + median);
            } 
            else {
                int mid_index = (numbers.size() - 1)/2;
                double median = numbers.get(mid_index);
                System.out.println("Median: " + median); 
            }
            break;
            }
            }
        }
    }
