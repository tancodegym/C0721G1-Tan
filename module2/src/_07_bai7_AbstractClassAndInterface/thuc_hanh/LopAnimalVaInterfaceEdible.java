package _07_bai7_AbstractClassAndInterface.thuc_hanh;

abstract class Animal {
    public abstract String makeSound();
}

class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}

class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

interface Edible {
    String howToEat();
}

class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

abstract class Fruit implements Edible {
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}

