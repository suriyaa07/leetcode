class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowels = new HashMap<>();
        Map<Character,Integer> consonents = new HashMap<>();

        for(Character c : s.toCharArray()){
            if("aeiou".contains(String.valueOf(c))){
                vowels.put(c,vowels.getOrDefault(c,0)+1);
            }
            else{
                consonents.put(c,consonents.getOrDefault(c,0)+1);
            }
        }
        int vMax = 0;
        int cMax = 0;
        for(Character c : vowels.keySet()){
            if(vowels.get(c) > vMax)
                vMax = vowels.get(c);
        }

        for(Character c : consonents.keySet()){
            if(consonents.get(c) > cMax)
                cMax = consonents.get(c);
        }

        return vMax + cMax;

    }
}