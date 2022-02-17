package day9;

  class A extends Thread {
	  public void run() {
		  System.out.println("Current ID of A " + Thread.currentThread().getId());
	  }
  }
  class B extends Thread {
	  public void run() {
		  System.out.println("Current ID of B " + Thread.currentThread().getId());
	  }
  }
  class C extends Thread {
	  public void run() {
		  System.out.println("Current ID of C " + Thread.currentThread().getId());
	  }
  }
  class D extends Thread {
	  public void run() {
		  System.out.println("Current ID of D " + Thread.currentThread().getId());
	  }
  }
  class E implements Runnable {
	  public void run() {
		  System.out.println("Current ID of E " + Thread.currentThread().getId());
	  }
  }
public class Threaddemo {

	public static void main(String[] args) {
		 A a = new A();
		 a.start();
		 B b = new B();
		 b.start();
		 C c = new C();
		 c.start();
		 D d = new D();
		 d.start();
		 E e = new E();
		 Thread th = new Thread(e);
		 th.start(); 
		 System.out.println( "ID of Main Method " + Thread.currentThread().getId());
	}
}
