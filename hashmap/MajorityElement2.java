import java.util.Collection.*;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;



public class MajorityElement2{

    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<> ();
        ArrayList <Integer>  list = new ArrayList<>();
        for (int i =0; i<nums.length; i++){
            if (hm.containsKey(nums[i])) {
                int of = hm.get(nums[i]);
                hm.put(nums[i], of+1);
            }else {
                hm.put(nums[i], 1);
            }
        }

        int cap =(int) Math.floor(nums.length/3);

        for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()){
            if (entry.getValue() > cap ){
                list.add(entry.getKey());
            }
        }

        return list;
    }
    public static void main(String[] args) {
        MajorityElement2 majorityElement2 = new MajorityElement2();
        ArrayList <Integer>  list = new ArrayList<>();
        list.addAll(majorityElement2.majorityElement(new int[]{3, 2, 3, 2, 2, 2}));

        System.out.println(list);
    }
}
