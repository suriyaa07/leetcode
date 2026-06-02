// class Solution {
//     public int furthestDistanceFromOrigin(String moveL) {
    
//         StringBuilder sb = new StringBuilder(moveL);
//         String moveR = sb.toString();
//         moveL = moveL.replace('_','L');
//         moveR = moveR.replace('_','R');

//         //count L and R for move1
//         int l1 = 0;
//         int r1 = 0;
//         for(Character c : moveL.toCharArray()){
//             if(c == 'L') l1++;
//             if(c == 'R') r1++;
//         }
//         l1 = Math.abs(l1);
//         r1 = Math.abs(r1);
//         int ans1 = Math.abs(l1-r1);

//          //count L and R for move2
//         int l2 = 0;
//         int r2 = 0;
//         for(Character c : moveR.toCharArray()){
//             if(c == 'L') l2++;
//             if(c == 'R') r2++;
//         }
//         l2 = Math.abs(l2);
//         r2 = Math.abs(r2);
//         int ans2 = Math.abs(l2-r2);

//         return Math.max(ans1,ans2);

//     }
// }

class Solution { public int furthestDistanceFromOrigin(String move) { //count L and R for move1 
int l1 = 0; int r1 = 0; 
for(Character c : move.toCharArray()){ 
    if(c == 'L' || c=='_') l1++; if(c == 'R') r1++; 
    } 
    l1 = Math.abs(l1); r1 = Math.abs(r1); 
    int ans1 = Math.abs(l1-r1); 
//count L and R for move2 
int l2 = 0; int r2 = 0; 
for(Character c : move.toCharArray()){ 
    if(c == 'L') l2++; if(c == 'R' || c=='_') r2++; 
    } 
    l2 = Math.abs(l2); r2 = Math.abs(r2); 
int ans2 = Math.abs(l2-r2); 
return Math.max(ans1,ans2); 
}
}