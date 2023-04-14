public class Student extends Comparable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String stdNum;

    public String getStdNum() {
        return stdNum;
    }

    public void setStdNum(String stdNum) {
        this.stdNum = stdNum;
    }

    public Student(String name, String stdNum) {
        this.name = name;
        this.stdNum = stdNum;
    }

    @Override
    public String toString() {
        return "[이름 : " + name + ", 학번 : " + stdNum + "]";
    }

    @Override
    public int compareTo(Comparable anotherValue) {
        Student std = (Student) anotherValue;

        String yourStdNum = std.getStdNum();
        return stdNum.compareTo(yourStdNum);
    }
}
