package hw6Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n----------------------------");
		Birds birds = new Birds();
		birds.birdsInfo();
		System.out.println("\n----------------------------");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		System.out.println("\n----------------------------");
		Dog dog = new Dog();
		dog.dogInfo();
		System.out.println("\n----------------------------");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		System.out.println("\n----------------------------");
		Robin robin = new Robin();
		robin.robinInfo();
		System.out.println("\n----------------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		System.out.println("\n----------------------------");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		System.out.println("\n----------------------------");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
	}

}
