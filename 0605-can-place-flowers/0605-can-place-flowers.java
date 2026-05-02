class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                int left;
                int right;
                if (i == 0) {
                    left = 0;
                } else {
                    left = flowerbed[i - 1];
                }
                if (i == len - 1) {
                    right = 0;
                } else {
                    right = flowerbed[i + 1];
                }

                if (left == 0 && right == 0) {
                    flowerbed[i] = 1; // plant flower
                    count++;

                    if (count >= n) return true;
                }
            }
        }

        return count >= n;
    }
}