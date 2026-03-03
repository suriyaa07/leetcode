class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        for(int i = 0;i<n;i++){
            StringBuilder xyz = new StringBuilder();
            for(char c : sb.toString().toCharArray()){
                xyz.append((char)(c^1));
            }
            sb.append("1");
            sb.append(xyz.reverse());
        }
    return sb.charAt(k-1);
    }
}