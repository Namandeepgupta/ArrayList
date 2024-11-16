import java.util.*;

public class Question1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(0);
        boolean result = monotonic(list);
        System.out.println("Monotonic: " + result);
    }
    public static boolean monotonic(ArrayList<Integer> list){
        boolean increase = true;
        boolean decrease = true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                increase = false;
            }
            else if(list.get(i) < list.get(i+1)){
                decrease = false;
            }
        }
        return increase || decrease;
    }
}
