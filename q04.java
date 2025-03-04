//4	Swap two numbers
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=40;
		swapNos(a,b);
		
	}
	
	public static void swapNos(int a,int b) {
		a=a+b;
		b=a-b;
		b=a+b;
		System.out.println("A : "+ a + " B : "+ b);
	}

}
