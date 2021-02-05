package cafeRe;

public class StarCafe {

	int money;

	public String OrderStar(int money) {
		if(money == Menu.StarLatte) {
			this.money += money;
			return "별카페의 라떼를 주문하셨습니다.";
		} else if(money == Menu.StarAmericano) {
			this.money += money;
			return "별카페의 아메리카노를 주문하셨습니다.";
		} else {
			return "가격의 메뉴가 없습니다.";
		}
	}
}
