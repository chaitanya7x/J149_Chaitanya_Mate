//1	Add two numbers/binary numbers/characters
public class q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q1 obj = new q1();
		
		int sum = obj.addNos(5, 10);
        System.out.println("Sum of numbers: " + sum);
        
        String binarySum = obj.addBinary("101", "110");
        System.out.println("Sum of binary numbers: " + binarySum);
        
        int charSum = obj.addChar('3', '5'); 
        System.out.println("Sum of character digits: " + charSum);
	}
	
	public int addNos(int a,int b) {
		int sum = a+b;
		return sum;
	}

	public String addBinary(String b1,String b2) {
		int a = Integer.parseInt(b1,2);
		int b = Integer.parseInt(b2,2);
		int sum= a+b;
		
		String res=Integer.toBinaryString(sum);
		return res;
	}
	
	public int addChar(char c1,char c2) {
		String str1=String.valueOf(c1);
		String str2=String.valueOf(c2);
		
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		
		int c=a+b;
		return c;
		
	}
}
