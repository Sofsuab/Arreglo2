public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Cati", "Dog", 30.5);
        animals[1] = new Animal("Rolex", "Cat", 10.2);
        animals[2] = new Animal("Zeus ", "Bird", 0.5);


        for (Animal animal : animals) {
            System.out.println(animal);
        }
        double averageWeight = Animal.calculateAverageWeight(animals);
        System.out.println("Average weight: " + averageWeight);

    }



}



