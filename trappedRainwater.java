public class trappedRainwater {
    public static int trapRainwater(int height[]) {
        int n = height.length;
        int width = 1;
        int maxL[] = new int[n];
        int maxR[] = new int[n];
        int waterLevel[] = new int[n];
        int waterArea = 0;
        maxL[0] = height[0];
        maxR[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            maxL[i] = Math.max(maxL[i - 1], height[i]);
        }
        for (int j = n - 2; j >= 0; j--) {
            maxR[j] = Math.max(maxR[j + 1], height[j]);
        }
        for (int i = 0; i < n; i++) {
            waterLevel[i] = Math.min(maxL[i], maxR[i]);
            waterLevel[i] = waterLevel[i] - height[i];
            waterLevel[i] = waterLevel[i] * width;
            waterArea += waterLevel[i];
        }
        return waterArea;
    }

    public static void main(String args[]) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int waterArea = trapRainwater(height);
        System.out.println(waterArea);

    }

}
