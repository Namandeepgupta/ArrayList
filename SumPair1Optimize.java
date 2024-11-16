import java.util.ArrayList;

public class SumPair1Optimize {
    public static boolean sumPair(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp < rp){
            int result = list.get(lp) + list.get(rp); 
            if(result == target){
                return true;
            }
            else{
                if(result < target){
                    lp++;
                }
                else{
                    rp--;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        int target = 10;
        boolean result = sumPair(list, target);
        System.out.println("Sum of 2 number is " + target + " : " + result);
    }
}
