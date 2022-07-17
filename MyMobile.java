package week2.assignments;

public class MyMobile {
	int a=25;
	String b = "java";
	public void makeCall() {
		System.out.println("Make a call");
		
	}
public void sendMsg() {
	System.out.println("send a Msg");

}
private void payBills() {
System.out.println("pay the bills");
}
public static void main(String[] args) {
	MyMobile obj = new MyMobile();
	System.out.println(obj.b);
	obj.makeCall();
	obj.sendMsg();
	obj.payBills();
	
}
}
