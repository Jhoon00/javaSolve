package Java230317.src;

public class ArrayProc1Test {
    final static int STUDENTS = 5;

    public static void main(String[] args) {
        int[] scores = new int[STUDENTS];
        ArrayProc1 obj = new ArrayProc1();
        obj.getValues(scores);
        System.out.println("평균은 = " + obj.getAverage(scores));
    }
}
