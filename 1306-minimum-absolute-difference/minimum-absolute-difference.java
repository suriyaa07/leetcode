class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        Arrays.sort(arr);

        for(int i = 0;i<len-1;i++){
                if( arr[i+1] - arr[i] < min ){
                    min = arr[i+1]  - arr[i];
                }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<len-1;i++){
                List<Integer> pair = new ArrayList<>();
                if(  arr[i+1]  -  arr[i] == min  ){
                    pair.add(arr[i]);
                    pair.add(arr[i+1]);
                }
                if (pair.size()>0){
                    ans.add(pair);
                }
        }
        return ans;
    }
}