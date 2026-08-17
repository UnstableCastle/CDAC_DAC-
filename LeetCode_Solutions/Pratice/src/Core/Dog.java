package Core;

class Dog extends Animal{
	
	
	public static void main(String[] args) {
		Animal d = new Dog();
		
		d.makeSound();
	}

	@Override
	public void makeSound() {
	
		System.out.println("Dog barks !!");
		
	}
	
}
