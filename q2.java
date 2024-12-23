package day_10;
import java.util.*;
class Employee{
	
	public double grossSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your salary");
		double salary = sc.nextDouble();
		double grossSalary = salary * (0.5+salary);
		return grossSalary;
	}
}
public class q2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		double grossSalary = e.grossSalary();
		System.out.println("your gross salary is : "+grossSalary);
	}

}
