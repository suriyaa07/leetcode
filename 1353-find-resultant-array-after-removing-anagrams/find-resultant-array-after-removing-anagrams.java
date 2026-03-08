class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> set = new ArrayList<>();
        List<String> list = new ArrayList<>();
        set.add(words[0]);

        for(int i = 1;i<words.length;i++){
            char[] arr1 = words[i].toCharArray();
            Arrays.sort(arr1);
            String word2 = new String(arr1);
            String last = set.getLast();
            char[] arr2 = last.toCharArray();
            Arrays.sort(arr2);
            String word1 = new String(arr2);
            if(!word1.equals(word2)){
                set.add(words[i]);
            }
        }

        for(String x : set){
            list.add(x);
        }

        return list;
    }
}