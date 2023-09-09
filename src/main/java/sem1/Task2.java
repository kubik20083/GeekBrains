package sem1;

public class Task2 {
    public static int run(int[] array) {
        int count = 0;
        int maxcount = 0;
        for (int item : array) {
            if (item == 1) {
                count++;
            } else {
                if (maxcount < count) {
                    maxcount = count;
                }
                count = 0;
            }

        }
        if(count > maxcount) {
            maxcount = count;
        }
        return maxcount;
    }
}
