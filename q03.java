//3	Calculate power of a number

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q3 obj=new q3();
		obj.calPower(2,4);
		obj.calPower(5,4);
		obj.calPower(5,2);
	}
	
	public void calPower(int base, int pow) {
		int res=0;
		int temp=base;
		while(pow>1) {
			res=base*temp;
			base=res;
			pow--;
		}

		System.out.println(res);
	}

}
