import java.util.ArrayList;

class test {

    public static void main(final String[] args) {
        // List of objects
        Animal Fluffy = new Cat();
        Animal BigRedDog = new Dog();
        // List of Functionality
        ArrayList<Animal> farmAnimals = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        farmAnimals.add(Fluffy);
        farmAnimals.add(BigRedDog);

        farmAnimals.forEach((animal -> {
            System.out.println(animal.makeSound());
        }));
    }
}

interface Animal {
    String makeSound();
}

class Cat implements Animal {

    Cat Cat(){
        return this;
    }
    @Override
    public String makeSound() {
        return "Cat Noises";
    }

}

class Dog implements Animal {

    @Override
    public String makeSound() {
        return "Dog Noises";
    }

}