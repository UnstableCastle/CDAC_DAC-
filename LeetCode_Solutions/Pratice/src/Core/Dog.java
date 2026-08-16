package Core;

class Dog extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Bark");
	}
	
	public static void main(String[] args) {
		Animal d = new Dog();
		
		d.makeSound();
	}
	
}
