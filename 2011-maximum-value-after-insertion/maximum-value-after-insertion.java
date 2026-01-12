class Solution {
    public String maxValue(String n, int x) {
        boolean flag = false;
        boolean positive;
        StringBuilder result = new StringBuilder();

        if(n.charAt(0) == '-'){
            positive = false;
            n = n.substring(1);
        } else {
            positive = true;
        }

        int len = n.length();

        if(positive){
            for(int i = 0; i<len ; i++){
                if( Integer.valueOf(n.charAt(i) - '0') < x ){
                    result = result.append(n.substring(0,i) + x + n.substring(i));
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                result = result.append(n);
                result.append(x);
            }

         } else { 
            for(int i = 0 ; i<len ; i++){
                if(Integer.valueOf(n.charAt(i) - '0') > x){
                    result = result.append(n.substring(0,i) + x + n.substring(i));
                    flag = true; 
                    break;
                }
            }
            if(flag == false){
                result = result.append(n);
                result.append(x);
            }
            result.insert(0,"-");
        }

        return result.toString();

    }
}