


import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (hm.containsKey(nums[i])) {
                int of = hm.get(nums[i]);
                hm.put(nums[i], of+1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        int count = 0;
        for (HashMap.Entry<Integer, Integer> entry: hm.entrySet()) {
            if(entry.getValue() > (int)nums.length/2) {
                count = entry.getKey();
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        MajorityElement majorityElement = new MajorityElement();
        int max = majorityElement.majorityElement(new int[]{2, 2, 2, 4, 5});
        System.out.println(max);
    }
}
