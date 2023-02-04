package returntype;

public class Test {
public A m1() {
	A a=new A();
	B b=new B();
	C c=new C();
	 return a;//---- allowed
	// return b;---- allowed
	// return c;---- allowed
	}
public B m2() {
	A a=new A();
	B b=new B();
	C c=new C();
	// return a;
	 return b;
	// return c; ----Not allowed (because C is not child of B)
}
public C m3() {
	A a=new A();
	B b=new B();
	C c=new C();
	// return a;----Not allowed (because A is parent of C)
	// return b;----Not allowed (because B is not child of C)
	 return c;
}
public static void main(String[]args) {
Test t= new Test();
System.out.println(t.m1());
System.out.println(t.m2());
System.out.println(t.m3());

}
}
