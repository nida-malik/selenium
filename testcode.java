
public class Test4 {
	int a=10;
	static int b=20;
	void m1(){
		//Test4 t1 = new Test4();
		System.out.println(a);
		System.out.println(Test4.b);
	}
	static void m2 (){
		Test4 t1 = new Test4();
		System.out.println(t1.a);
		System.out.println(Test4.b);
		
	}
	
public static void main(String[] args) {
	Test4 t1 = new Test4();
	t1.m1();

	Test4.m2();
	

	
	String x = "jan";
	
	switch (x)
	{
	case "jan":
		System.out.println("feb");
		break;
	case "feb":
		System.out.println("jan");
		break;
	}
	
	
}
	
	
}
