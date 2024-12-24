import java.util.HashMap;
public class MostFrequentEvenElement {
        public int mostFrequentEven(int[] nums) {
            HashMap <Integer , Integer> hm = new HashMap<>();

            for (int i =0; i<nums.length; i++){
                if (hm.containsKey(nums[i])){
                    int of = hm.get(nums[i]);
                    hm.put(nums[i], of+1);
                }else {
                    hm.put(nums[i], 1);
                }
            }

            int frE= -1 ; //frequent Element
            int fr = -1; //frequency
            for(HashMap.Entry<Integer, Integer> entry: hm.entrySet()) {
                if (entry.getKey() % 2 == 0) {

                    if (entry.getValue() > fr){

                        frE = entry.getKey();
                        fr = entry.getValue();

                    }else if(entry.getValue() == fr){

                        frE = Math.min(frE, entry.getKey());

                    }
                }
            }
            return frE;
    }

    public static void main(String[] args) {
        MostFrequentEvenElement mostFrequentEvenElement = new MostFrequentEvenElement();
        int frE = mostFrequentEvenElement.mostFrequentEven(new int[]{1,5,7,11,990});
        System.out.println(frE);

    }
}
