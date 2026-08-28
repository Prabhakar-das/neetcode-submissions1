class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        List<List<String>> lst = new ArrayList<>();
        for (String s : strs) {
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String s1= new String(c);
            mp.putIfAbsent(s1, new ArrayList<String>());
            mp.get(s1).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
