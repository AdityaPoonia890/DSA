import java.util.HashMap;

public class LuckyInteger {

        public int findLucky(int[] arr) {

            HashMap <Integer , Integer> hm = new HashMap<>();

            for (int i =0; i<arr.length; i++){
                if (hm.containsKey(arr[i])){
                    int of = hm.get(arr[i]);
                    hm.put(arr[i], of+1);
                }else {
                    hm.put(arr[i], 1);
                }
            }

            int lucky = -1;
            for(HashMap.Entry<Integer, Integer> entry: hm.entrySet()) {
                if (entry.getKey() == entry.getValue()){
                    lucky = entry.getKey();
                }
            }
            return lucky;
        }

    public static void main(String[] args) {
        LuckyInteger luckyInteger = new LuckyInteger();
        int lucky = luckyInteger.findLucky(new int[]{1,2,2,3,3,3});
        System.out.println(lucky);
    }
}
