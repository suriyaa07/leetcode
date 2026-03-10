class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int row = items.size();
        Integer col = null;
        if(ruleKey.equals("type"))
            col = 0;
        if(ruleKey.equals("color"))
            col = 1;
        if(ruleKey.equals("name"))
            col = 2;
        
        int count = 0;
        for(int i = 0;i<row;i++){
                if(items.get(i).get(col).equals(ruleValue))
                    count++;
        }
        return count;
    }
}