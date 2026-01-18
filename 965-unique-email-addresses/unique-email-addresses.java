class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String i : emails){
            String domain = i.substring(i.indexOf("@"));
            String removeDot = i.substring(0,i.indexOf("@")+1).replace(".","");
            String removePlus = removeDot.contains("+") ? 
                removeDot.substring(0,removeDot.indexOf("+")) 
                : removeDot.substring(0,removeDot.indexOf("@"));
            StringBuilder x = new StringBuilder("");
            x.append(removePlus).append(domain);
            if(!set.contains(x.toString())){
                set.add(x.toString());
            }
        }
        return set.size();
    }
}