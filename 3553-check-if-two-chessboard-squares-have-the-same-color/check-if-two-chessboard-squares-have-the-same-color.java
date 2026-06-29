class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char c1 =  coordinate1.charAt(0);
        int n1 = coordinate1.charAt(1) - '0';
        
        char c2 = coordinate2.charAt(0);
        int n2 = coordinate2.charAt(1) - '0';

        Set<Character> aceg = new HashSet<>();
        aceg.add('a'); aceg.add('c'); aceg.add('e'); aceg.add('g');

        Set<Character> bdfh = new HashSet<>();
        bdfh.add('b'); bdfh.add('d'); bdfh.add('f'); bdfh.add('h');

        boolean color1 = true;
        boolean color2 = true;
        //true is white, false is black. let default be true for both

        if(aceg.contains(c1) && n1%2!=0){
            color1 = false;
        }

        if(aceg.contains(c2) && n2%2!=0){
            color2 = false;
        }

        if(bdfh.contains(c2) && n2%2==0){
            color2 = false;
        }

        if(bdfh.contains(c1) && n1%2==0){
            color1 = false;
        }
        
        if(color2==color1)
            return true;
    return false;
    }
}