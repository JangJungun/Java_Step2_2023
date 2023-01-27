package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		//VIP고객
		System.out.println("-------VIP고객-------");
		int price = 10000;
		VIPCustomer vipcs = new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불 완료하였습니다.");
		System.out.println(vipcs.showCustomer());
		
		System.out.println("-------일반고객-------");
		price = 10000;
		Customer customer = new Customer(1005, "soldesk");
		
		int csprice = customer.calcPrice(price);
		System.out.println(customer.getCustomerName()+"님이 "+csprice+"원을 지불 완료하였습니다.");
		System.out.println(customer.showCustomer());
		
	}

}
