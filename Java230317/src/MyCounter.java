package Java230317.src;
public class MyCounter {

    public static void addOne(int val){
        val = val+1;
    }

    private int value;

    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static void increase(MyCounter cntObj1){
        int v = cntObj1.getValue()+1;
        cntObj1.setValue(v);
    }

    public static void main(String[] args) {
        
        MyCounter mc = new MyCounter();
        mc.setValue(10);                        
        MyCounter.increase(mc);               
        System.out.println(mc.getValue());
    }
}
