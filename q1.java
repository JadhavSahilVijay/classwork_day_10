package day_10;

class Clanguage{
	public void C () {
		System.out.println("Its C language");
	}
}
class Cpp{
	public void cpp () {
		System.out.println("Its cpp language");
	}
}
class Java{
	public void java () {
		System.out.println("Its Java language");
	}
}
class Swift{
	public void swift () {
		System.out.println("Its swift language");
	}
}
public class q1 {

	public static void main(String[] args) {
		Clanguage c = new Clanguage();
		Cpp cpp = new Cpp();
		Java java = new Java();
		Swift swift = new Swift();
		c.C();
		cpp.cpp();
		java.java();
		swift.swift();
	}

}
