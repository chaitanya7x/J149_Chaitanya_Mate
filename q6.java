//6	Calculate area and circumference of circle using multiple classes
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(circle.calArea(3));
		System.out.println(circle.calCircumference(21));
	}

}

class circle{
	static double area,circumference;
	public static double calArea(int radius) {
		area=(22/7)*(radius*radius);
		return area;
	}
	
	public static double calCircumference(int radius) {
		circumference=2*(22/7)*radius;
		return circumference;
	}
}
