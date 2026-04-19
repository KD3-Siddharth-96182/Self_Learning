import java.util.ArrayList;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public String toString() {
        return name;
    }
}


class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(name + " roars");
    }
}

class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(name + " trumpets");
    }
}


class Zoo {
    private String zooName;
    private ArrayList<Animal> animals;

    public Zoo(String zooName) {
        this.zooName = zooName;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void showAnimals() {
        System.out.println("Zoo: " + zooName);
        for (Animal a : animals) {
            System.out.print(a + " -> ");
            a.sound();
        }
    }
}




public class Tester {
	 public static void main(String[] args) {

	        Zoo zoo = new Zoo("City Zoo");

	        zoo.addAnimal(new Lion("Simba"));
	        zoo.addAnimal(new Elephant("Dumbo"));

	        zoo.showAnimals();
	    }
}











