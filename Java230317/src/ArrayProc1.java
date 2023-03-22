package Java230317.src;

import java.util.Scanner;

public class ArrayProc1 {
    public void getValues(int array[]){
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            System.out.print("성적을 입력하세요 : ");
            array[i] = scn.nextInt();
        }
    }

    public double getAverage(int array[]){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum / array.length;
    }
}
