package day_10;
import java.util.*;
class Triangle{
	public void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base");
		int base = sc.nextInt();
		System.out.println("enter the height");
		int height = sc.nextInt();
		int area = 1/2*base*height;
		System.out.println("area of traingle is : "+area);
	}
}
class Circle{
	public void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		int r = sc.nextInt();
		double area = 3.14*r*r;
		System.out.println("area of circle is : "+area);
	}
}
class Rectangle{
	public void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int l = sc.nextInt();
		System.out.println("enter the width");
		int w = sc.nextInt();
		int area = l*w;
		System.out.println("area of rectangle is : "+area);
	}
}
public class q4 {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		t.area();
		r.area();
		c.area();
	}

}
