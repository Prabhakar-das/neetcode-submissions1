class Solution {
    public boolean isPalindrome(String s) {
        String org = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
        String rev = "";
        for(int i=org.length()-1;i>=0;i--){
            rev+=org.charAt(i);
        }
        System.out.println(rev);
        return org.equals(rev);
    }
}
