package cafeRe;

public class Man {

	String name;
	int money;
	int change;

	public void Man(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public int BuyStarCafe(StarCafe menu, int money) {
		String order = menu.OrderStar(4500);
		System.out.println(name+"님께서는 "+money+"원으로 "+order);
		this.change = this.money - money;
		System.out.println(name+"님의 잔액은"+change+"입니다.");
		return change;
	}

	public void BuyBeanCafe(BeanCafe menu, int money) {
		String order = menu.OrderBean(4100);
		System.out.println(name+"님께서는 "+money+"원으로 "+order);
		this.change = this.money - money;
		System.out.println(name+"님의 잔액은"+change+"입니다.");
	}
}
