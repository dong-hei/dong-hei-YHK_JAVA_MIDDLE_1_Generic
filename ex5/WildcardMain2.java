package collection.generic.ex5;

import collection.generic.animal.Animal;
import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); // Animal 보다 밑에 있어서 안됨
//        writeBox(catBox); // Animal 보다 밑에 있어서 안됨2
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍무이", 100));
    }
}
