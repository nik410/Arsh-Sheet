class Solution {
    public String minWindow(String s, String t) {
        // HashMap<Character, Integer> count = new HashMap<>();
        // HashMap<Character, Integer> has = new HashMap<>();
        // int miss = t.length();
        // for (int i = 0; i < t.length(); i ++) {
        //     char c = t.charAt(i);
        //     if (!count.containsKey(c)) {
        //         count.put(c, 0);
        //     }
        //     count.put(c, count.get(c) + 1);
        // }
        // String min = "";
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < s.length(); i ++) {
        //     char c = s.charAt(i);
        //     sb.append(c);
        //     if (!count.containsKey(c)) {
        //         continue;
        //     }
        //     if (!has.containsKey(c)) {
        //         has.put(c, 0);
        //     }
        //     has.put(c, has.get(c) + 1);
        //     if (has.get(c) <= count.get(c)) {
        //         miss --;
        //     }
        //     while (miss == 0) {
        //         if (min.equals("") || min.length() > sb.length()) {
        //             min = sb.toString();
        //         }
        //         char remove = sb.charAt(0);
        //         sb.deleteCharAt(0);
        //         if (has.containsKey(remove)) {
        //             has.put(remove, has.get(remove) - 1);
        //             if (has.get(remove) < count.get(remove)) {
        //                 miss ++;
        //             }
        //         }
        //     }
        // }

        // return min;

        HashMap<Character, Integer> hm = new HashMap();

        for(char c: t.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        int eleInT = t.length();
        
        int l = 0, r = 0;
        int maxWind = Integer.MAX_VALUE;
        int lWind = 0, rWind = 0;

        while(r < s.length()){
            char c = s.charAt(r);

            if(hm.containsKey(c) && hm.get(c) > 0){
                eleInT --;
            }

            hm.put(c, hm.getOrDefault(c, 0) - 1);

            while(eleInT == 0){
                int currWind = r - l + 1;
                if(currWind < maxWind){
                    lWind = l;
                    rWind = r;
                    maxWind = currWind;
                }

                char ch = s.charAt(l);

                hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                if(hm.containsKey(ch) && hm.get(ch) > 0){
                    eleInT ++;
                }

                l ++;
            }
            r ++;
        }

        if(maxWind == Integer.MAX_VALUE)return "";
        return s.substring(lWind, rWind + 1);


    }
}
