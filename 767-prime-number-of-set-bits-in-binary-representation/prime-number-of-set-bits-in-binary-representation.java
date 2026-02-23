class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> prime = new HashSet<>();
        prime.add(2); prime.add(3); prime.add(5);
        prime.add(7); prime.add(11); prime.add(13);
        prime.add(17); prime.add(19);

        int count = 0;
        for(int i = left;i<=right;i++){
            String binary = Integer.toBinaryString(i);
            int setCount = 0;
            for(int j = 0;j<binary.length();j++){
                if(binary.charAt(j)=='1'){
                    setCount++;
                }
            }
            if(prime.contains(setCount)){
                count++;
            }
        }
        return count;
    }
}