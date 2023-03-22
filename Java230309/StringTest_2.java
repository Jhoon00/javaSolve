import java.util.*;

public class StringTest_2 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열을 입력하세여> ");
			str = sc.next();
			if (str.equals("quit") == true) { // quit 입력시 프로그램 종료
				break;
			}
			if (str.matches("^www\\.(.+)")) { // www로 시작하는가??
				System.out.println(str + " 은 'www'로 시작합니다.");
			} else {
				System.out.println(str + " 은 'www'로 시작하지 않습니다.");
			}
		}

	}
}
