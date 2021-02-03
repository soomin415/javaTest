package JavaTest;

import java.util.Scanner;

public class calculatorTest {

	public static void main(String[] args) {

		int a;
		int b;
		int str;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			do {
				System.out.println("<<나누기와 나머지 연산은 숫자가 하나라도 0이면 연산할 수 없습니다.>>");
				System.out.println("연산할 첫번째 정수 입력해주세요.");
				a = scanner.nextInt();
				System.out.println("연산할 두번째 정수를 입력해주세요.");
				b = scanner.nextInt();
				System.out.println("연산 방법을 숫자로 입력하세요. 1.더하기+ 2.빼기- 3.곱하기* 4.나누기/ 5.나머지%");
				str = scanner.nextInt();
			} while((str==4 || str==5) && (a==0 || b==0));
			if(str==1) {
				System.out.printf("두 수의 연산값은 %d입니다.",a+b);
				System.out.println(); }
			else if(str==2) {
				System.out.printf("두 수의 연산값은 %d입니다.",a-b);
				System.out.println(); }

			else if(str==3)
				System.out.printf("두 수의 연산값은 %d입니다.",a*b);
			else if(str==4) {
				if(a>=b)
					System.out.printf("두 수의 연산값은 %d입니다.",a/b);
				else
					System.out.printf("두 수의 연산값은 %d입니다.",b/a);
			} else if(str==5) {
				if(a>=b)
					System.out.printf("두 수의 연산값의 나머지는 %d입니다.",a%b);
				else
					System.out.printf("두 수의 연산값의 나머지는 %d입니다.",b%a);
			}

		}
	}
}


