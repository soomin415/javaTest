package JavaTest;

public class manTest {

	public static void main(String[] args) {

		man James = new man();
			James.age = 40;
			James.name = "James";
			James.marrige = true;
			James.child = 3;
			
		man Mary = new man();
			Mary.age=25;
			Mary.name="Mary";
			Mary.marrige=false;
			Mary.child=2;
			
		James.showmaninfo(James);
		Mary.showmaninfo(Mary);
	}

}
