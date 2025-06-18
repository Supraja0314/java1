package xyz;
class animal{
	void sound() {
		System.out.println("animal makes a sound");
	}
}
class dog1 extends animal{
	void sound() {
		System.out.println("bow bow");
	}
}
class cat1 extends animal{
	void sound() {
		System.out.println("meow meow");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a1=new animal();
		animal a2=new dog1();
		animal a3=new cat1();
		a1.sound();
		a2.sound();
		a3.sound();
	}

}