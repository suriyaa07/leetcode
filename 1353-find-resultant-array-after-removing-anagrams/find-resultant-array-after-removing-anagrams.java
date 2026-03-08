class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> temp = new ArrayList<>();
        List<String> list = new ArrayList<>();
        temp.add(words[0]);
        for(int i = 1;i<words.length;i++){
            char[] arr1 = words[i].toCharArray();
            Arrays.sort(arr1);
            String word2 = new String(arr1);
            String last = temp.getLast();
            char[] arr2 = last.toCharArray();
            Arrays.sort(arr2);
            String word1 = new String(arr2);
            if(!word1.equals(word2)){
                temp.add(words[i]);
            }
        }

        for(String x : temp){
            list.add(x);
        }

        return list;
    }
}