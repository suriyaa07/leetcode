class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int len = words.length; // no of words
        List<Integer> list = new ArrayList<>();

        for(String word : words){
            int currentWordLength = word.length();
            int currentWeight = 0;
            for(int i = 0;i<currentWordLength;i++){
                currentWeight = currentWeight + (weights[word.charAt(i)-'a']);
            }
            list.add(currentWeight%26);
        }
        String answer = "";
        for(int i : list){
        answer = answer + (char)('z'-i);
        }
        return answer;
    }
}