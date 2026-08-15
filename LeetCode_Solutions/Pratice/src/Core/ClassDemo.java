package Core;

public class ClassDemo {
//int sample;
//
//public static void main(String[] args) {
//	ClassDemo c = new ClassDemo();
//	c.sample=10;
//	
//	ClassDemo d = c;
//	d.sample=20;
//	
//	System.out.println(c.sample+" ");
//	System.out.println(d.sample);
//}
//}



		int w =10;
	
public static void main(String[] args) {
	
	int a = 5;
	int b = a ; 
	b =99;
	
	
	
	
	ClassDemo box1 = new ClassDemo();
	ClassDemo box2 = box1;
	
	box2.w = 99;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(box1.w);
	System.out.println(box2.w);
	
	
	
}

}

