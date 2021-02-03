package JavaTest;

public class order {

	long orderNumber;
	String id;
	int orderYear;
	int orderMonth;
	int orderDay;
	String orderName;
	String productNum;
	String orderAddress;
	
	public void showOrderInfo(order order) {
		System.out.println("주문번호 : "+order.orderNumber) ;
		System.out.println("주문자 아이디 : "+order.id);
		System.out.println("주문 날짜 : "+order.orderYear+"년 "+order.orderMonth+"월 "+order.orderDay+"일");
		System.out.println("주문자 이름 : "+order.orderName);
		System.out.println("주문 상품 번호 : "+order.productNum);
		System.out.println("배송 주소 : "+order.orderAddress);
		System.out.println();
		System.out.println();
	}
}
	
	
	
