import java.util.Collection.*;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MaximumFrequencyNumber {
    int maxRepeating(int k, int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if (hm.containsKey(arr[i])){
                int of = hm.get(arr[i]);
                hm.put(arr[i], of+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }

        AtomicInteger max = new AtomicInteger(1);
        AtomicInteger maxE =new AtomicInteger(arr[0]);


        hm.forEach( (key, v) -> {
            if (v > max.get()) {
                maxE.set(key);
                max.set(v);
            } else if(v == max.get()) {
                maxE.set(Math.min(maxE.get() , key));
            }
        });

        return maxE.get();
    }
    public static void main(String[] args) {

        MaximumFrequencyNumber maximum = new MaximumFrequencyNumber();
        int[] arr = {2,2,1,1,1,5,5,5,5,5,6};
        int max= maximum.maxRepeating(3,arr );
        System.out.println(max);
    }
}
