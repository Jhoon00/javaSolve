package Java230317.src;

public class ArrayProcTest {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        ArrayProc obj = new ArrayProc();

        obj.inc(list); 
        
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
