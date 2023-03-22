package Java230317.src;

public class Employee {
    private String name;
    private double salary;
    private static int count;

    public Employee(String n, double s){
        name = n;
        salary = s;
        count++;
    }

    @Override
    protected void finalize(){
        count--;
    }

    public static int getCount(){
        return count;
    }
}
