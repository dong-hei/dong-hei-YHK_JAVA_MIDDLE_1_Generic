package collection.generic.ex5;

import collection.generic.animal.Animal;
import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {

        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍무이", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);
//        WildcardEx.printWildcardV2(objBox); // extends Animal이 있기때문에 안됨

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("스코티쉬 폴드", 130));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);


    }
}
