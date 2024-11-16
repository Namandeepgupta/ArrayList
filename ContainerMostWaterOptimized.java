import java.util.*;

public class ContainerMostWaterOptimized {
    public static int ContainerWater(ArrayList<Integer> height){
        int result = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            int h = Math.min(height.get(lp), height.get(rp));
            int w = rp-lp;
            int currresult = h*w;

            result = Math.max(result,currresult);

            if(lp < rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        return result;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int result = ContainerWater(height);
        System.out.println("Result: " + result);
    }
}
