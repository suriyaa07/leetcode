class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,Integer> upper = new HashMap<>();
        Map<Character,Integer> lower = new HashMap<>();

        for(Character c : word.toCharArray()){
            if(Character.isLowerCase(c))
                lower.put(c,lower.getOrDefault(c,0)+1);
            else
                upper.put(c,lower.getOrDefault(c,0)+1);
        }
        int tot = 0;
        for(Character c : lower.keySet()){
            int l_count = lower.getOrDefault(c,0);
            int u_count = upper.getOrDefault(Character.toUpperCase(c),0);
            tot+=Math.min(l_count,u_count);
        }
        return tot;
    }
}