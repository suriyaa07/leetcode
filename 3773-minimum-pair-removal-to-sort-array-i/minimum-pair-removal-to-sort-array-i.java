class Solution {
    public int minimumPairRemoval(int[] nums) {
        //array to arraylist
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        if(sorted(list)){
            return 0;
        }
        int count = 0;
        boolean isOrder = false;
        //iterate and find the smalest pair
        //iterate reverse , so even if multiple pair exist , we choose left most one

        while(!isOrder){
        int index = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<list.size();i++){
            if(list.get(i) + list.get(i-1) < min ){
                min = list.get(i) + list.get(i-1);
                index = i;
                
            }

        }
        list.remove(index);
        list.remove(index-1);
        list.add(index-1,min);

        isOrder = sorted(list);
        count++;
        }
        return count;

    }

    //check if array is sorted or not
    boolean sorted(List<Integer> list){
        boolean isOrder = true;
        for(int i = 0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                isOrder = false;
                break;
            }
        }
    return isOrder;
    }
}