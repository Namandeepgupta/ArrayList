import java.util.ArrayList;

public class Operation{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int get = list.get(3);
        System.out.println(get);
        list.remove(3);
        System.out.println(list);
        list.set(2, 10);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));
    }
}