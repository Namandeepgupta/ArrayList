import java.util.ArrayList;

public class ContainerMostWaterBruteForce{
    public static int ContainerWater(ArrayList<Integer> height){
        int result = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int h = Math.min(height.get(i) , height.get(j));
                int w = j-i;
                int currentWater = h*w;
                result = Math.max(result, currentWater);
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