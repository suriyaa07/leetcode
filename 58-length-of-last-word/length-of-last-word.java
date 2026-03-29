class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");
        int  l = arr.length;
        return arr[l-1].length();
    }
}