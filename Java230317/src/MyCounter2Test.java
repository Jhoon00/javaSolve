package Java230317.src;

public class MyCounter2Test {
    public static void main(String[] args) {
        MyCounter2 obj = new MyCounter2();

        System.out.println("obj.value = " + obj.value);
        obj.inc(obj);
        System.out.println("obj.value = " + obj.value);
    }
}
