class Solution {
    public int minChanges(String s) {
        
        List<Set<Character>> set = new ArrayList<>();
        char[] charArray = s.toCharArray();

        for(int i = 0;i<charArray.length;i+=2){
            Set<Character> tinySet = new HashSet<>();
            tinySet.add(charArray[i]);
            tinySet.add(charArray[i+1]);
            set.add(tinySet);
        }

        int count = 0;
        for(int i = 0;i<set.size();i++){
            Set<Character> hi = set.get(i);
            if(hi.contains('1') && hi.contains('0')) count++;
        }

        return count;
    }
}