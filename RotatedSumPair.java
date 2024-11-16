import java.util.ArrayList;

public class RotatedSumPair {
    public static boolean sumPair(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i=0; i<n; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        
        while(lp != rp){
            int result = list.get(lp) + list.get(rp);
            if(result == target){
                return true;
            }
            else{
                if(result < target){
                    lp = (lp+1) % n;
                }
                else{
                    rp = (n + rp -1) % n;
                }
            }
        }

        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);
        int target = 8;
        boolean result = sumPair(list, target);
        System.out.println("Sum of 2 number is " + target + " : " + result);
    }
}
