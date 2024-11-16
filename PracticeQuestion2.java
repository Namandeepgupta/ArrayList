import java.util.*;

public class PracticeQuestion2 {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(5);
        input.add(3);
        ArrayList<Integer> output = lonelyNumbers(input);
        System.out.println("Result: " + output);
    }

    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> input) {
        Collections.sort(input);  
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            int current = input.get(i);
            boolean isLonely = true;

            // Check previous number 
            if (i > 0 && (input.get(i - 1) == current || input.get(i - 1) + 1 == current)) {
                isLonely = false;
            }

            // Check next number
            if (i < input.size() - 1 && (input.get(i + 1) == current || input.get(i + 1) == current + 1)) {
                isLonely = false;
            }

            if (isLonely) {
                output.add(current);
            }
        }

        return output;
    }
}
