class Solution {
    public String capitalizeTitle(String title) {
        String []words = title.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String i : words){
            if(i.length()>2){
                sb.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1).toLowerCase());
                sb.append(" ");
            } else {
                sb.append(i.toLowerCase());
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}