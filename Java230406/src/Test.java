public class Test {
    public static void main(String[] args) {
        Student[] stds = new Student[5];

        stds[0] = new Student("김지훈", "0000000");
        stds[1] = new Student("이재일", "1111111");
        stds[2] = new Student("강주원", "2222222");
        stds[3] = new Student("석진석", "3333333");
        stds[4] = new Student("이주현", "4444444");

        Util.selectionSort(stds);

        for (Student std : stds) {
            System.out.println(std);
        }

        System.out.println();

        Professor[] prfs = new Professor[7];
        prfs[0] = new Professor("이경미 교수님");
        prfs[1] = new Professor("류은영 교수님");
        prfs[2] = new Professor("김종률 교수님");
        prfs[3] = new Professor("박성철 교수님");
        prfs[4] = new Professor("조수연 교수님");
        prfs[5] = new Professor("이중권 교수님");
        prfs[6] = new Professor("이노우에 사치코 교수님");

        Util.selectionSort(prfs);

        for (Professor prf : prfs) {
            System.out.println(prf);
        }
    }
}
