public class StringTest {
    public static void main(String[] args) {
        String proverb = "A barking dog";
        String s1, s2, s3, s4;

        System.out.println("문자열의 길이 =" + proverb.length());

        s1 = proverb.concat(" never Bites!");            //결합
        s2 = proverb.replace('B', 'b');     //교환
        s3 = proverb.substring(2, 5);   //부분 추출
        s4 = proverb.toUpperCase();                          //대문자로 변환   

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
