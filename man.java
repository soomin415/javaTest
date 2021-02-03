package JavaTest;

public class man {
	
	int age;
	String name;
	boolean marrige;
	int child;
	
	public void showmaninfo(man man) {
		System.out.printf("나이 : %d",man.age);
		System.out.println();
		System.out.printf("이름 : %s",man.name);
		System.out.println();
		System.out.println("결혼여부 : "+man.marrige);
		System.out.printf("자녀 수 :"+man.child);
		System.out.println();
		System.out.println();
	}
}
