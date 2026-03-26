class Solution {
    public String sortSentence(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        int len = list.size();
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<=len;i++){
            for(String j : list){
                if(j.contains(String.valueOf(i))){
                    j = j.substring(0,j.length()-1);
                    sb.append(j);
                    sb.append(" ");
                }
            }
        }
        return sb.toString().trim();
    }
}