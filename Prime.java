package week2.assignments;

public class Prime {

	public static void main(String[] args) {
		int a = 14;
		boolean flag=false;
		for(int i=2;i<=(a/2);i++) {
			//2;2<=7;2++
			//3;3<=7;3++......7
			if(a%i==0) {
				flag=true;
				break;
			}
			if(flag==true) {
				System.out.println(a + "is a Prime Number");
			
			}else {
				System.out.println(a + "is not a Prime Number");
			}
		}
	}

}
