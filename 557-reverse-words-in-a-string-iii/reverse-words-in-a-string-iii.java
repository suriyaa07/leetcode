class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int len = arr.length;

        for(String i : arr){
            String rev = "";
            for(int j = i.length()-1;j>=0;j--){
                rev+=i.charAt(j);
            }
            sb.append(rev + " ");
        }
        return sb.toString().trim();
    }
}