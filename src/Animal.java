public class Animal {
    private String name;
    private String race;
    private double weight;

    public Animal(String name, String race, double weight) {
        this.name = name;
        this.race = race;
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
    public static double calculateAverageWeight(Animal[] animals) {
        double averageWeight = 0;
        for (Animal animal : animals) {
            averageWeight += animal.getWeight();
        }
        return averageWeight / animals.length;
    }
}