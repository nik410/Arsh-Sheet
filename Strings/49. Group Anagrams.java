class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap();

        for(int i = 0; i < strs.length; i ++){
            String s = strs[i];
            char arrS[] = s.toCharArray();
            Arrays.sort(arrS);
            String sortedS = "";
            for(char c: arrS){
                sortedS += c;
            }

            hm.put(sortedS, hm.getOrDefault(sortedS, new ArrayList<String>()));
            List<String> temp = hm.get(sortedS);
            temp.add(s);
            hm.put(sortedS, temp);
        }
        List<List<String>> ans = new ArrayList();
        for(String s: hm.keySet()){
            ans.add(hm.get(s));
        }

        return ans;
    }
}
