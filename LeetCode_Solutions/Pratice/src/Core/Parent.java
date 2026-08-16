package Core;

public class Parent {
private int w =1000000;

public Parent() {
	System.out.println("default con");
}

public int getW() {
	return this.w;
}

public static void main(String[] args) {
	Child c = new Child();
	c.showW();
	c.getW();
}
}

class Child extends Parent{
	public Child() {
		super();
		
		System.out.println("child con");
	}

	public void showW() {
	System.out.println(getW());
	}
	
	
}



