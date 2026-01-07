class Solution {
    public int maximum69Number (int num) {
        int ans = 0;
        int len = String.valueOf(num).length();
        int arr[] = new int[len];

        for(int i = len-1; i>=0 ;i--){
            arr[i] = num%10;
            num = num/10;
        }

        for(int i = 0; i<=len-1;i++){
            if(arr[i]==6){
                arr[i] = 9;
                break;
            }
        }

        for(int i = 0;i<=len-1;i++){
            ans = ans*10;
            ans = ans + arr[i];
        }
        return ans;
    }
}