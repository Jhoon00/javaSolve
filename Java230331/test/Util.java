package Java230331.test;

public class Util {
    public static void selectionSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[minIdx] > values[j]) {
                    minIdx = j;
                }
            }
            swap(i, minIdx, values);
        }
    }

    private static void swap(int idx1, int idx2, int[] values) {
        int tmp = values[idx1];
        values[idx1] = values[idx2];
        values[idx2] = tmp;
    }
}