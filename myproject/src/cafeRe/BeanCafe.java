package cafeRe;

public class BeanCafe {

	int money;

	public String OrderBean(int money) {
		if(money == Menu.BeanLatte) {
			this.money += money;
			return "콩카페의 라떼를 주문하셨습니다.";
		} else if(money == Menu.StarAmericano) {
			this.money += money;
			return "콩카페의 아메리카노를 주문하셨습니다.";
		} else {
			return "가격에 맞는 메뉴가 없습니다.";
		}
	}
}
