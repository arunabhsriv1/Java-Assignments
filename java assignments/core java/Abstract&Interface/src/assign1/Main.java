package assign1;

public class Main {

	public static void main(String[] args) {

		Animal animals[]=new Animal[5];
		
		animals[0]=new Cat();
		animals[1]=new Dog();
		animals[2]=new Lion();

		animals[0].talk();
		animals[1].talk();
		animals[2].talk();

	}

}
