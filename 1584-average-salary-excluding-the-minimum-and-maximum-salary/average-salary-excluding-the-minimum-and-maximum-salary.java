class Solution {
    public double average(int[] salary) {
        int len = salary.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for(int i : salary){
            sum+=i;
            if(min>i) min = i;
            if(max<i) max = i;
        }
        sum = sum - max - min;
        return sum/(len - 2);
    }
}