package JavaTest;

public class orderTest {

	public static void main(String[] args) {

		order order1 = new order();
			order1.orderNumber = 20190721001l;
			order1.id = "abc123";
			order1.orderYear = 2019;
			order1.orderMonth = 7;
			order1.orderDay = 21;
			order1.orderName = "홍길순";
			order1.productNum = "PD0345-12";
			order1.orderAddress = "서울시 영등포구 여의도동 20번지";
	
		order1.showOrderInfo(order1);
	}
}


