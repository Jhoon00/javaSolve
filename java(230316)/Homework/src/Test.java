class A {
    private int a;  //전용
    int b;          //디폴트
    public int c;   //공용
}

public class Test {
    public static void main(String[] args) {
        A obj = new A();

        // obj.a = 10;   같은 클래스가 아니라서 사용X
        obj.b = 20;      // 디폴트라서 접근 가능
        obj.c = 30;      // 공용이라서 접근 가능
    }
}
