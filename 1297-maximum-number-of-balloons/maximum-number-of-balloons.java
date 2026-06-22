class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : text.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;
        int b = map.getOrDefault('b',0);
        int a = map.getOrDefault('a',0);
        int l = map.getOrDefault('l',0);
        int o = map.getOrDefault('o',0);
        int n = map.getOrDefault('n',0);

        while(b-1>=0 && a-1>=0 && l-2>=0 && o-2>=0 && n-1>=0){
            count++;
            b-=1;
            a-=1;
            l-=2;
            o-=2;
            n-=1;
        }

        //b
        //a
        //l l 
        //o o 
        //n
        return count;
    }
}