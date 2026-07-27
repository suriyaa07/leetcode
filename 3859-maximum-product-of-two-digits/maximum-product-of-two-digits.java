class Solution {
    public int maxProduct(int n) {
        String num = Integer.toString(n);
        char[] arr = num.toCharArray();
        Arrays.sort(arr);
        int len = arr.length;
        return (arr[len-1] - '0') * (arr[len-2]-'0');
    }
}