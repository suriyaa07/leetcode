class Solution {
    public String trimTrailingVowels(String s) {
        while(!s.isEmpty() && "aeiou".contains(String.valueOf(s.charAt(s.length()-1)))){
            s = s.substring(0,s.length()-1);
        }
        return s;
    }
}