//9	Swap two variables without using the third variable
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=100;
		b=2000;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a :" +a+" b:"+b);
	}

}
