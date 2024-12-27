import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
public class UncommonWords {

        public String[] uncommonFromSentences(String s1, String s2) {

            ArrayList <String> arr = new ArrayList<>();
            String s = "";
            HashMap <String, Integer> hm1 = new HashMap<>();
            //  HashMap <String, Integer> hm2 = new HashMap<>();
            for(int i=0; i<s1.length(); i++) {
                if(i == s1.length()-1) {
                    s = s + s1.charAt(i);
                    if (hm1.containsKey(s)) {
                        int of = hm1.get(s);
                        hm1.put(s, of+1);
                        s = "";
                    } else {
                        hm1.put(s , 1);
                        s = "";
                    }
                }

                else if (s1.charAt(i)!= ' '){
                    s = s + s1.charAt(i);

                }
                else {
                    if (hm1.containsKey(s)) {
                        int of = hm1.get(s);
                        hm1.put(s, of+1);
                        s = "";
                    } else {
                        hm1.put(s , 1);
                        s = "";
                    }
                }
            }

            for(int i=0; i<s2.length(); i++) {
                if (i == s2.length()-1) {
                    s = s + s2.charAt(i);
                    if (hm1.containsKey(s)) {
                        int of = hm1.get(s);
                        hm1.put(s, of+1);
                        s = "";
                    } else {
                        hm1.put(s , 1);
                        s = "";
                    }

                }
                else if (s2.charAt(i)!= ' '){
                    s = s + s2.charAt(i);
                } else {
                    if (hm1.containsKey(s)) {
                        int of = hm1.get(s);
                        hm1.put(s, of+1);
                        s = "";
                    } else {
                        hm1.put(s , 1);
                        s = "";
                    }
                }
            }

            for (HashMap.Entry<String , Integer> entry: hm1.entrySet()) {
                String k = entry.getKey();
                int v = entry.getValue();

                if (v == 1) {
                    arr.add(k);
                }
            }

      /* for (HashMap.Entry<String , Integer> entry: hm2.entrySet()) {
        String k = entry.getKey();
        int v = entry.getValue();

        if (v == 1 && hm1.containsKey(k) == false) {
            arr.add(k);
        }
       }*/
            Object[] obj = arr.toArray();
            return Arrays.copyOf(obj, obj.length, String[].class);
        }

}
