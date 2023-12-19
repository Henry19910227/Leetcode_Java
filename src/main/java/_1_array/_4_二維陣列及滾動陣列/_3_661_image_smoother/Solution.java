package _1_array._4_二維陣列及滾動陣列._3_661_image_smoother;

public class Solution implements Solution_661 {

    @Override
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                int count = 1;
                int sum = img[i][j];
                if (i - 1 >= 0 && j - 1 >= 0) {
                    sum += img[i-1][j-1];
                    count++;
                }
                if (i - 1 >= 0) {
                    sum += img[i-1][j];
                    count++;
                }
                if (i - 1 >= 0 && j + 1 < img[i].length) {
                    sum += img[i-1][j+1];
                    count++;
                }
                if (j + 1 < img[i].length) {
                    sum += img[i][j+1];
                    count++;
                }
                if (i + 1 < img.length && j + 1 < img[i].length) {
                    sum += img[i+1][j+1];
                    count++;
                }
                if (i + 1 < img.length) {
                    sum += img[i+1][j];
                    count++;
                }
                if (i + 1 < img.length && j - 1 >= 0) {
                    sum += img[i+1][j-1];
                    count++;
                }
                if (j - 1 >= 0) {
                    sum += img[i][j-1];
                    count++;
                }
                result[i][j] = sum/count;
            }
        }
        return result;
    }
}
