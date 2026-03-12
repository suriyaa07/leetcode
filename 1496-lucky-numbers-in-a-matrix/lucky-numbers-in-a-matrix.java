class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        // min
        for(int i = 0;i<len1;i++){
            int minNum = Integer.MAX_VALUE;
            for(int j = 0;j<len2;j++){
                if(matrix[i][j] < minNum){
                    minNum = matrix[i][j];
                }
            }
            min.add(minNum);
        }
        //max
        for(int i = 0;i<len2;i++){
            int maxNum = Integer.MIN_VALUE;
            for(int j = 0;j<len1;j++){
                if(matrix[j][i] > maxNum){
                    maxNum = matrix[j][i];
                }
            }
            max.add(maxNum);
        }
        for(int i : max){
            for(int j : min){
                if(i==j){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}