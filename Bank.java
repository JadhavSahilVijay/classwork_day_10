package day_10;
import java.util.*;
class Open{
	public void openAc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("enter your Adhar Card no");
		int adhar = sc.nextInt();
	}
}
class Credit{
	int b = 0;
	public void creditCash() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount you want to credit");
		int amt = sc.nextInt();
		b += amt;
		System.out.println("your balance is : "+b);
	}
}
class Debit extends Credit{
	public void debitCash() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount you want to debit");
		int amt = sc.nextInt();
		if(b<=0) {
			System.out.println("low balance");
		}else if(amt<b) {
			System.out.println("invalid transaction");
		}else {
			 b-=amt;
		}
		System.out.print("your current balance is : "+b);
	}
}
public class Bank {

	public static void main(String[] args) {
		Open o = new Open();
		Credit c = new Credit();
		Debit d = new Debit();

		o.openAc();
		c.creditCash();
		d.debitCash();
	}

}
