import java.util.HashMap;
public class EquivalentStrings {

        public boolean checkAlmostEquivalent(String word1, String word2) {
            HashMap<Character, Integer> hm1 = new HashMap<>();
            HashMap<Character, Integer> hm2 = new HashMap<>();

            for(int i = 0; i< word1.length(); i++){
                if (hm1.containsKey(word1.charAt(i))) {
                    int of = hm1.get(word1.charAt(i));
                    hm1.put(word1.charAt(i), of+1);
                } else {
                    hm1.put(word1.charAt(i), 1);
                }

                if (hm2.containsKey(word2.charAt(i))) {
                    int of2 = hm2.get(word2.charAt(i));
                    hm2.put(word2.charAt(i), of2+1);
                } else {
                    hm2.put(word2.charAt(i), 1);
                }
            }

            boolean eq = true;
            //  Set< HashMap.Entry<Character, Integer>> entry2 = hm2.entrySet();

            for(HashMap.Entry<Character, Integer> entry: hm1.entrySet()) {
                Character key = entry.getKey();
                Integer value = entry.getValue();


                //  Character key2 = entry2.getKey();
                // Integer value2 = entry2.getValue();

                if (hm2.get(key) == null ) {
                    if ( value > 3)
                        eq = false;
                } else{

                    if (value - hm2.get(key) > 3 || hm2.get(key) - value > 3) {
                        eq = false;
                    }
                }

        /* if (hm1.get(key2) == null ) {
            if ( value2 > 3)
            eq = false;
        } else{

        if (value2 - hm1.get(key2) > 3 || hm1.get(key2) - value2 > 3) {
            eq = false;
        }
        }*/

            }

            for(HashMap.Entry<Character, Integer> entry2: hm2.entrySet()) {
                Character key = entry2.getKey();
                Integer value = entry2.getValue();

                if (hm1.get(key) == null ) {
                    if ( value > 3)
                        eq = false;
                } else{

                    if (value - hm1.get(key) > 3 || hm1.get(key) - value > 3) {
                        eq = false;
                    }
                }
            }

            return eq;
        }

    public static void main(String[] args) {
        EquivalentStrings equivalentStrings = new EquivalentStrings();
        boolean b = equivalentStrings.checkAlmostEquivalent("eeejjj", "aabbcc");
        System.out.println(b);
    }
    }

