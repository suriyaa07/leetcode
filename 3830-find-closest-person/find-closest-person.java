class Solution {
    public int findClosest(int x, int y, int z) {
        int xz = Math.abs(x-z);
        int yz = Math.abs(y-z);

        if(yz>xz)
            return 1;
        if(xz>yz)
            return 2;

        return 0;
    }
}