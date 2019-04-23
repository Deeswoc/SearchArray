import java.util.ArrayList;
import java.util.Collections;

public class Searching {

    public static void main(String args[]){
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for(int i = 0; i < 100; i ++){
            integers.add(i);
        }
        for(int i = 0; i < 100; i++){
            search(integers, i);
        }
    }

    static int search(ArrayList<Integer> list, int key){
        Collections.sort(list);
        int low = 0, high = list.size(), mid = (high - low) / 2;

        while(list.get(mid) != key && low <= high){
            mid = (low + high)/2;
            if(key < list.get(mid)){
                high = mid - 1;
            } else if(key > list.get(mid)){
                low = mid + 1;
            } else {
              break;
            }
        }
        if(list.get(mid) == key){
            System.out.println("The index of " + list.get(mid) + " is: " + mid);
            return mid;
        } else {
            System.out.println("Integer not found");
            return -1;
        }
    }
}
