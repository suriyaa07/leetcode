class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        List<String> list = new ArrayList<>(Arrays.asList(text.split(" ")));
        int words = list.size();
        for(String s : list){
            for(char c : brokenLetters.toCharArray()){
                if(s.indexOf(c)!=-1){
                    words--;
                    break;
                }
            }
        }
        return words;
    }
}