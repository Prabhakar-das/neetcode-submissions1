class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        List<List<String>> lst = new ArrayList<>();
        for (String s : strs) {
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String s1= new String(c);
            if(mp.containsKey(s1)){
                mp.putIfAbsent(s1, new ArrayList<String>());
                mp.get(s1).add(s);
            }
            else{
                mp.put(s1, new ArrayList<String>());
                mp.get(s1).add(s);
            }
        }
        for(Map.Entry<String,List<String>> itr : mp.entrySet()){
            List<String>l= itr.getValue();
            lst.add(l);
        }
        return lst;
    }
}
