package day_10;

import java.util.Scanner;

class Student{
	Scanner sc = new Scanner(System.in);
	public void personalInfo() {
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("enter marks of maths");
		int maths = sc.nextInt();
		System.out.println("enter marks of science");
		int sci = sc.nextInt();
		System.out.println("enter marks of english");
		int eng = sc.nextInt();
		averageMarks(maths,sci,eng,name);
		
	}
	public void averageMarks(int maths, int sci, int eng, String name) {
		double average = (maths+sci+eng)/3;
		System.out.println(name+" your average marks is : "+average);
	}
	
}
public class q3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.personalInfo();

	}

}
