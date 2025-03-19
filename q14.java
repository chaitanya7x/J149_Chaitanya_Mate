// Find the mod of the number without using % operator
public class q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =23;
		int modVal=2;
		modFunc(num,modVal);
	}
	
	public static void modFunc(int num,int modVal) {
		if(num>0) {
			int rem=num/modVal;
			int value=rem*modVal;
			int mod= num-value;
			System.out.println(mod);
		}
		else {
			System.out.println("0");
		}
	}

}
