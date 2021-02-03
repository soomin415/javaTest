package JavaTest;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		//  1   2     3       4     1   2   3
		//321  21     1       0     1  12 123
		//  1 123 12345 1234567 12345 123   1
		System.out.println("7줄 다이아몬드 생성 for문");
		for(int i=0;i<4;i++) {
			for(int j=3;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<i*2+2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>i*2;k--) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		System.out.println();
		
		Scanner scanner2 = new Scanner(System.in);
		while(true) {
			int str;
			System.out.println("다이아몬드 별 찍을 길이를 홀수 숫자로 적어주세요.");
			str = scanner2.nextInt();
			while((str%2)==0 || str==1) {
				System.out.println("홀수가 아니거나 1을 작성하였습니다. 다시 작성해주세요.");
				str = scanner2.nextInt();
			} 
				
			for(int i=0;i<((str/2)+1);i++) {
				for(int j=(str/2);j>i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<i*2+2;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=0;i<(str/2);i++) {
				for(int j=0;j<i+1;j++) {
					System.out.print(" ");
				}
				for(int k=str-2;k>i*2;k--) {
					System.out.print("*");
				}
				System.out.println();
				
				}
		}
	}
}

