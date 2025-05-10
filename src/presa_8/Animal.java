package presa_8;

import java.util.ArrayList;
import java.util.List;

class Animal {

    //Метод родительского класса
    void makeSound() {
        System.out.println("Издает звук");
    }
}

class Dog extends Animal {

    //Переопределение метода родительского класса
    @Override
    void makeSound() {
        System.out.println("ГАВ-ГАВ");
    }
}

class Cat extends Animal {

    //Переопределение метода родительского класса
    @Override
    void makeSound() {
        System.out.println("мяу-мяу");
    }
}

class Cow extends Animal {

    //Переопределение метода родительского класса
    @Override
    void makeSound() {
        System.out.println("Мууууууууу");
    }
}

class ResultAnimal{
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}