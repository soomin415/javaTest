package cafeRe;

public class CafeTest {

	public static void main(String[] args) {

		Man Kim = new Man();
		Kim.name = "김졸려";
		Kim.money = 20000;
		Man Lee = new Man();
		Lee.name = "이피곤";
		Lee.money = 15000;
		
		StarCafe star = new StarCafe();
		star.money = 0;
		BeanCafe bean = new BeanCafe();
		bean.money = 0;
		
		Kim.BuyStarCafe(star, Menu.StarAmericano);
		Lee.BuyBeanCafe(bean, Menu.BeanLatte);
		Kim.BuyStarCafe(star, Menu.StarLatte);

	}

}
